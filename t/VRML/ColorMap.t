package VRML::Test::ColorMap;
use 5.20.2;
use strict;

BEGIN {
	unless( defined $VRML::Test::ALL ) {
		use Test::More;
		eval('use constant libDir => qw(lib)');
		eval('use Test::Pod');
		$PerWRL::Test::POD = 1; 	# Test POD docs by default
		$PerWRL::Test::POD = 0 		# Skip POD docs if Test::Pod is not available
			if(  "$@" ); 
	} 
}

$VRML::Test::ColorMap = sub {	
	if( $PerWRL::Test::POD ) {
		pod_file_ok(libDir .'/VRML/ColorMap.pm');
	}
};

unless( defined $VRML::Test::ALL ) {
	&$VRML::Test::ColorMap;

	done_testing();
}
