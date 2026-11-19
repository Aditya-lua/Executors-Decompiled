; ssl3_setup_buffers @ 009ccdc8
009ccdc8	str x19,[sp, #-0x20]!
009ccdcc	stp x29,x30,[sp, #0x10]
009ccdd0	add x29,sp,#0x10
009ccdd4	mov x19,x0
009ccdd8	bl 0x009ccbbc
009ccddc	cbz w0,0x009ccdf8
009ccde0	mov w1,#0x1
009ccde4	mov x0,x19
009ccde8	mov x2,xzr
009ccdec	bl 0x009ccc84
009ccdf0	cmp w0,#0x0
009ccdf4	cset w0,ne
009ccdf8	ldp x29,x30,[sp, #0x10]
009ccdfc	ldr x19,[sp], #0x20
009cce00	ret
