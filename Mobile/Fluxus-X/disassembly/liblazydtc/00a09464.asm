; BN_mod_sqr @ 00a09464
00a09464	str x21,[sp, #-0x30]!
00a09468	stp x20,x19,[sp, #0x10]
00a0946c	mov x20,x2
00a09470	mov x2,x3
00a09474	stp x29,x30,[sp, #0x20]
00a09478	add x29,sp,#0x20
00a0947c	mov x19,x3
00a09480	mov x21,x0
00a09484	bl 0x00c39090
00a09488	cbz w0,0x00a094b0
00a0948c	mov x3,x20
00a09490	mov x4,x19
00a09494	ldp x29,x30,[sp, #0x20]
00a09498	ldp x20,x19,[sp, #0x10]
00a0949c	mov x0,xzr
00a094a0	mov x1,x21
00a094a4	mov x2,x21
00a094a8	ldr x21,[sp], #0x30
00a094ac	b 0x00c38ab0
00a094b0	ldp x29,x30,[sp, #0x20]
00a094b4	ldp x20,x19,[sp, #0x10]
00a094b8	ldr x21,[sp], #0x30
00a094bc	ret
