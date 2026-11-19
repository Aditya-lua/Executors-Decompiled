; OSSL_DECODER_INSTANCE_get_input_structure @ 00a4dda4
00a4dda4	cbz x0,0x00a4ddb8
00a4dda8	ldrb w8,[x0, #0x20]
00a4ddac	and w8,w8,#0x1
00a4ddb0	str w8,[x1]
00a4ddb4	ldr x0,[x0, #0x18]
00a4ddb8	ret
