; FUN_00a73940 @ 00a73940
00a73940	sub sp,sp,#0xd0
00a73944	stp x22,x21,[sp, #0xa0]
00a73948	stp x20,x19,[sp, #0xb0]
00a7394c	stp x29,x30,[sp, #0xc0]
00a73950	ldr x8,[x2, #0x20]
00a73954	mov w21,w0
00a73958	add x29,sp,#0xc0
00a7395c	mov x19,x2
00a73960	mov x0,x8
00a73964	mov x20,x1
00a73968	bl 0x00c37cd0
00a7396c	cmp w0,#0x6
00a73970	b.eq 0x00a73988
00a73974	ldr x0,[x19, #0x20]
00a73978	bl 0x00c37cd0
00a7397c	cmp w0,#0x390
00a73980	mov w0,wzr
00a73984	b.ne 0x00a739ec
00a73988	ldr x0,[x19, #0x20]
00a7398c	bl 0x00c3d8d0
00a73990	mov x22,x0
00a73994	bl 0x00c3db80
00a73998	cmp w0,#0x6
00a7399c	b.cc 0x00a739e8
00a739a0	add x1,sp,#0x50
00a739a4	mov x2,sp
00a739a8	mov x0,x22
00a739ac	bl 0x00c3db30
00a739b0	cbz w0,0x00a739e8
00a739b4	ldr x8,[sp, #0x28]
00a739b8	cbz x8,0x00a739e8
00a739bc	ldr x9,[x19, #0x30]
00a739c0	mov w0,wzr
00a739c4	ldr w9,[x9, #0x8]
00a739c8	cmp w9,#0x2
00a739cc	b.ne 0x00a739ec
00a739d0	mov w0,w21
00a739d4	mov x1,x20
00a739d8	mov x2,x19
00a739dc	str x8,[x19, #0x20]
00a739e0	bl 0x00a6fd84
00a739e4	b 0x00a739ec
00a739e8	mov w0,wzr
00a739ec	ldp x29,x30,[sp, #0xc0]
00a739f0	ldp x20,x19,[sp, #0xb0]
00a739f4	ldp x22,x21,[sp, #0xa0]
00a739f8	add sp,sp,#0xd0
00a739fc	ret
