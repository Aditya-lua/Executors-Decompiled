; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::seekpos @ 0097ebdc
0097ebdc	str x21,[sp, #-0x30]!
0097ebe0	stp x20,x19,[sp, #0x10]
0097ebe4	stp x29,x30,[sp, #0x20]
0097ebe8	add x29,sp,#0x20
0097ebec	ldr x8,[x0, #0x78]
0097ebf0	mov x21,x0
0097ebf4	cbz x8,0x0097ec28
0097ebf8	ldr x8,[x21]
0097ebfc	mov x0,x21
0097ec00	mov x19,x2
0097ec04	mov x20,x1
0097ec08	ldr x8,[x8, #0x30]
0097ec0c	blr x8
0097ec10	cbnz w0,0x0097ec28
0097ec14	ldr x0,[x21, #0x78]
0097ec18	mov x1,x19
0097ec1c	mov w2,wzr
0097ec20	bl 0x00c31e70
0097ec24	cbz w0,0x0097ec48
0097ec28	mov x20,xzr
0097ec2c	mov x19,#-0x1
0097ec30	mov x0,x20
0097ec34	mov x1,x19
0097ec38	ldp x29,x30,[sp, #0x20]
0097ec3c	ldp x20,x19,[sp, #0x10]
0097ec40	ldr x21,[sp], #0x30
0097ec44	ret
0097ec48	str x20,[x21, #0x88]
0097ec4c	b 0x0097ec30
