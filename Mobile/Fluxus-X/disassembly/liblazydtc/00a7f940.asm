; HMAC_Final @ 00a7f940
00a7f940	sub sp,sp,#0x70
00a7f944	stp x20,x19,[sp, #0x50]
00a7f948	stp x29,x30,[sp, #0x60]
00a7f94c	ldr x8,[x0]
00a7f950	str x21,[sp, #0x40]
00a7f954	add x29,sp,#0x60
00a7f958	cbz x8,0x00a7f9bc
00a7f95c	mov x21,x0
00a7f960	ldr x0,[x0, #0x8]
00a7f964	mov x19,x2
00a7f968	mov x20,x1
00a7f96c	mov x1,sp
00a7f970	sub x2,x29,#0x14
00a7f974	bl 0x00c31f60
00a7f978	cbz w0,0x00a7f9bc
00a7f97c	ldr x0,[x21, #0x8]
00a7f980	ldr x1,[x21, #0x18]
00a7f984	bl 0x00c34bf0
00a7f988	cbz w0,0x00a7f9bc
00a7f98c	ldr x0,[x21, #0x8]
00a7f990	ldur w2,[x29, #-0x14]
00a7f994	mov x1,sp
00a7f998	bl 0x00c31f80
00a7f99c	cbz w0,0x00a7f9bc
00a7f9a0	ldr x0,[x21, #0x8]
00a7f9a4	mov x1,x20
00a7f9a8	mov x2,x19
00a7f9ac	bl 0x00c31f60
00a7f9b0	cbz w0,0x00a7f9bc
00a7f9b4	mov w0,#0x1
00a7f9b8	b 0x00a7f9c0
00a7f9bc	mov w0,wzr
00a7f9c0	ldp x29,x30,[sp, #0x60]
00a7f9c4	ldp x20,x19,[sp, #0x50]
00a7f9c8	ldr x21,[sp, #0x40]
00a7f9cc	add sp,sp,#0x70
00a7f9d0	ret
