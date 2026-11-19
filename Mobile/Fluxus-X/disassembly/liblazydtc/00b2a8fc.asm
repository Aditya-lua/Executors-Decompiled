; FUN_00b2a8fc @ 00b2a8fc
00b2a8fc	stp x22,x21,[sp, #-0x30]!
00b2a900	stp x20,x19,[sp, #0x10]
00b2a904	mov x19,x5
00b2a908	mov x5,xzr
00b2a90c	stp x29,x30,[sp, #0x20]
00b2a910	add x29,sp,#0x20
00b2a914	mov x22,x3
00b2a918	mov x20,x0
00b2a91c	bl 0x00c41250
00b2a920	mov w21,w0
00b2a924	cbz x22,0x00b2a93c
00b2a928	cbz w21,0x00b2a93c
00b2a92c	ldr x8,[x20, #0xa8]
00b2a930	mov x0,x20
00b2a934	ldr x8,[x8, #0x20]
00b2a938	blr x8
00b2a93c	cbz w21,0x00b2a958
00b2a940	mov x0,x20
00b2a944	mov x1,x19
00b2a948	bl 0x00b2ad0c
00b2a94c	cmp w0,#0x0
00b2a950	csel w0,wzr,w21,eq
00b2a954	b 0x00b2a95c
00b2a958	mov w0,wzr
00b2a95c	ldp x29,x30,[sp, #0x20]
00b2a960	ldp x20,x19,[sp, #0x10]
00b2a964	ldp x22,x21,[sp], #0x30
00b2a968	ret
