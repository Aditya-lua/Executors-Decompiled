; RECORD_LAYER_is_sslv2_record @ 009ccb34
009ccb34	ldr w8,[x0, #0x650]
009ccb38	cmp w8,#0x2
009ccb3c	cset w0,eq
009ccb40	ret
