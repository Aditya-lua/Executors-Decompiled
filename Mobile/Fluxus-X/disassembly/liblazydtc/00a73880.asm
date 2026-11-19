; FUN_00a73880 @ 00a73880
00a73880	sub sp,sp,#0xd0
00a73884	stp x22,x21,[sp, #0xa0]
00a73888	stp x20,x19,[sp, #0xb0]
00a7388c	stp x29,x30,[sp, #0xc0]
00a73890	ldr x8,[x2, #0x20]
00a73894	mov w21,w0
00a73898	add x29,sp,#0xc0
00a7389c	mov x19,x2
00a738a0	mov x0,x8
00a738a4	mov x20,x1
00a738a8	bl 0x00c37cd0
00a738ac	cmp w0,#0x6
00a738b0	b.eq 0x00a738c8
00a738b4	ldr x0,[x19, #0x20]
00a738b8	bl 0x00c37cd0
00a738bc	cmp w0,#0x390
00a738c0	mov w0,wzr
00a738c4	b.ne 0x00a7392c
00a738c8	ldr x0,[x19, #0x20]
00a738cc	bl 0x00c3d8d0
00a738d0	mov x22,x0
00a738d4	bl 0x00c3db80
00a738d8	cmp w0,#0x5
00a738dc	b.cc 0x00a73928
00a738e0	add x1,sp,#0x50
00a738e4	mov x2,sp
00a738e8	mov x0,x22
00a738ec	bl 0x00c3db30
00a738f0	cbz w0,0x00a73928
00a738f4	ldr x8,[sp, #0x20]
00a738f8	cbz x8,0x00a73928
00a738fc	ldr x9,[x19, #0x30]
00a73900	mov w0,wzr
00a73904	ldr w9,[x9, #0x8]
00a73908	cmp w9,#0x2
00a7390c	b.ne 0x00a7392c
00a73910	mov w0,w21
00a73914	mov x1,x20
00a73918	mov x2,x19
00a7391c	str x8,[x19, #0x20]
00a73920	bl 0x00a6fd84
00a73924	b 0x00a7392c
00a73928	mov w0,wzr
00a7392c	ldp x29,x30,[sp, #0xc0]
00a73930	ldp x20,x19,[sp, #0xb0]
00a73934	ldp x22,x21,[sp, #0xa0]
00a73938	add sp,sp,#0xd0
00a7393c	ret
