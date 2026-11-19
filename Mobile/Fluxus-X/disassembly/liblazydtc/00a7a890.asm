; FUN_00a7a890 @ 00a7a890
00a7a890	str x23,[sp, #-0x40]!
00a7a894	stp x22,x21,[sp, #0x10]
00a7a898	stp x20,x19,[sp, #0x20]
00a7a89c	stp x29,x30,[sp, #0x30]
00a7a8a0	ldr x8,[x0, #0x88]
00a7a8a4	add x29,sp,#0x30
00a7a8a8	cbz x8,0x00a7a90c
00a7a8ac	mov x22,x0
00a7a8b0	ldr x0,[x0, #0x90]
00a7a8b4	cbz x0,0x00a7a90c
00a7a8b8	ldr x21,[x22, #0x98]
00a7a8bc	mov x19,x2
00a7a8c0	mov x20,x1
00a7a8c4	bl 0x00c3a8b0
00a7a8c8	cbz x0,0x00a7a950
00a7a8cc	ldr x21,[x21, #0x10]
00a7a8d0	mov x23,x0
00a7a8d4	cbz x21,0x00a7a96c
00a7a8d8	cbz x20,0x00a7a97c
00a7a8dc	mov x0,x23
00a7a8e0	bl 0x00c3a7e0
00a7a8e4	ldr x1,[x19]
00a7a8e8	mov x2,x0
00a7a8ec	mov x0,x20
00a7a8f0	mov x3,x21
00a7a8f4	mov x4,xzr
00a7a8f8	bl 0x00c3b020
00a7a8fc	cmp w0,#0x1
00a7a900	b.lt 0x00a7a938
00a7a904	sxtw x8,w0
00a7a908	b 0x00a7a9a0
00a7a90c	bl 0x00c342a0
00a7a910	adrp x0,0x2c1000
00a7a914	adrp x2,0x2c5000
00a7a918	add x0,x0,#0xd1f
00a7a91c	add x2,x2,#0xb43
00a7a920	mov w1,#0xb2
00a7a924	bl 0x00c342b0
00a7a928	mov w0,#0x10
00a7a92c	mov w1,#0x8c
00a7a930	mov x2,xzr
00a7a934	bl 0x00c342c0
00a7a938	mov w0,wzr
00a7a93c	ldp x29,x30,[sp, #0x30]
00a7a940	ldp x20,x19,[sp, #0x20]
00a7a944	ldp x22,x21,[sp, #0x10]
00a7a948	ldr x23,[sp], #0x40
00a7a94c	ret
00a7a950	bl 0x00c342a0
00a7a954	adrp x0,0x2c1000
00a7a958	adrp x2,0x2c5000
00a7a95c	add x0,x0,#0xd1f
00a7a960	add x2,x2,#0xb43
00a7a964	mov w1,#0xb7
00a7a968	b 0x00a7a924
00a7a96c	ldr x0,[x22, #0x88]
00a7a970	bl 0x00c3a8b0
00a7a974	mov x21,x0
00a7a978	cbnz x20,0x00a7a8dc
00a7a97c	mov x0,x21
00a7a980	bl 0x00c36880
00a7a984	cbz x0,0x00a7a93c
00a7a988	bl 0x00c3aa70
00a7a98c	add w8,w0,#0x7
00a7a990	add w9,w0,#0xe
00a7a994	cmp w8,#0x0
00a7a998	csel w8,w9,w8,lt
00a7a99c	sbfx x8,x8,#0x3,#0x1d
00a7a9a0	mov w0,#0x1
00a7a9a4	str x8,[x19]
00a7a9a8	b 0x00a7a93c
