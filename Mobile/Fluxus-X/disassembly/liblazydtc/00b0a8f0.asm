; X509_STORE_CTX_get_obj_by_subject @ 00b0a8f0
00b0a8f0	stp x22,x21,[sp, #-0x30]!
00b0a8f4	mov w21,w1
00b0a8f8	adrp x1,0x2aa000
00b0a8fc	stp x20,x19,[sp, #0x10]
00b0a900	mov x20,x2
00b0a904	mov x22,x0
00b0a908	add x1,x1,#0xba3
00b0a90c	mov w0,#0x10
00b0a910	orr w2,wzr,#0x1c0
00b0a914	stp x29,x30,[sp, #0x20]
00b0a918	add x29,sp,#0x20
00b0a91c	bl 0x00c34250
00b0a920	mov x19,x0
00b0a924	cbz x0,0x00b0a964
00b0a928	mov x0,x22
00b0a92c	mov w1,w21
00b0a930	mov x2,x20
00b0a934	mov x3,x19
00b0a938	str wzr,[x19]
00b0a93c	bl 0x00b0aa34
00b0a940	cbnz w0,0x00b0a9b8
00b0a944	ldr w8,[x19]
00b0a948	cmp w8,#0x2
00b0a94c	b.eq 0x00b0a998
00b0a950	cmp w8,#0x1
00b0a954	b.ne 0x00b0a9a0
00b0a958	ldr x0,[x19, #0x8]
00b0a95c	bl 0x00c31a90
00b0a960	b 0x00b0a9a0
00b0a964	bl 0x00c342a0
00b0a968	adrp x0,0x2aa000
00b0a96c	adrp x2,0x2b0000
00b0a970	add x0,x0,#0xba3
00b0a974	add x2,x2,#0xa62
00b0a978	mov w1,#0x1c3
00b0a97c	bl 0x00c342b0
00b0a980	mov w1,#0x100
00b0a984	mov w0,#0xb
00b0a988	movk w1,#0xc, LSL #16
00b0a98c	mov x2,xzr
00b0a990	bl 0x00c342c0
00b0a994	b 0x00b0a9b8
00b0a998	ldr x0,[x19, #0x8]
00b0a99c	bl 0x00c382b0
00b0a9a0	adrp x1,0x2aa000
00b0a9a4	add x1,x1,#0xba3
00b0a9a8	mov w2,#0x1f3
00b0a9ac	mov x0,x19
00b0a9b0	bl 0x00c32310
00b0a9b4	mov x19,xzr
00b0a9b8	mov x0,x19
00b0a9bc	ldp x29,x30,[sp, #0x20]
00b0a9c0	ldp x20,x19,[sp, #0x10]
00b0a9c4	ldp x22,x21,[sp], #0x30
00b0a9c8	ret
