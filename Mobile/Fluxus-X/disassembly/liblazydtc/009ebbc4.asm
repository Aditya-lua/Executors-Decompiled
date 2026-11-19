; tls_post_process_client_key_exchange @ 009ebbc4
009ebbc4	str x19,[sp, #-0x20]!
009ebbc8	stp x29,x30,[sp, #0x10]
009ebbcc	ldr w8,[x0, #0x74]
009ebbd0	mov x19,x0
009ebbd4	add x29,sp,#0x10
009ebbd8	cbz w8,0x009ebc00
009ebbdc	mov x0,x19
009ebbe0	mov w1,wzr
009ebbe4	bl 0x00c345a0
009ebbe8	cmp w0,#0x0
009ebbec	mov w8,#0x2
009ebbf0	csel w0,wzr,w8,eq
009ebbf4	ldp x29,x30,[sp, #0x10]
009ebbf8	ldr x19,[sp], #0x20
009ebbfc	ret
009ebc00	ldr x8,[x19, #0x918]
009ebc04	ldr x8,[x8, #0x2b8]
009ebc08	cbz x8,0x009ebbdc
009ebc0c	ldr x8,[x19, #0x188]
009ebc10	cbz x8,0x009ebc20
009ebc14	mov w1,#0x1
009ebc18	mov x0,x19
009ebc1c	b 0x009ebbe4
009ebc20	bl 0x00c342a0
009ebc24	adrp x0,0x2bd000
009ebc28	adrp x2,0x2d5000
009ebc2c	add x0,x0,#0x74c
009ebc30	add x2,x2,#0xa51
009ebc34	mov w1,#0xd43
009ebc38	bl 0x00c342b0
009ebc3c	mov w2,#0x103
009ebc40	mov w1,#0x50
009ebc44	movk w2,#0xc, LSL #16
009ebc48	mov x0,x19
009ebc4c	mov x3,xzr
009ebc50	bl 0x00c34410
009ebc54	mov w0,wzr
009ebc58	b 0x009ebbf4
