; RAND_add @ 00ac8184
00ac8184	str d8,[sp, #-0x30]!
00ac8188	stp x20,x19,[sp, #0x10]
00ac818c	stp x29,x30,[sp, #0x20]
00ac8190	add x29,sp,#0x20
00ac8194	mov v8.16B,v0.16B
00ac8198	mov w20,w1
00ac819c	mov x19,x0
00ac81a0	bl 0x00ac7d50
00ac81a4	cbz x0,0x00ac81cc
00ac81a8	ldr x2,[x0, #0x18]
00ac81ac	cbz x2,0x00ac81cc
00ac81b0	mov x0,x19
00ac81b4	mov w1,w20
00ac81b8	ldp x29,x30,[sp, #0x20]
00ac81bc	ldp x20,x19,[sp, #0x10]
00ac81c0	mov v0.16B,v8.16B
00ac81c4	ldr d8,[sp], #0x30
00ac81c8	br x2
00ac81cc	mov x0,xzr
00ac81d0	bl 0x00ac7f78
00ac81d4	cmp w20,#0x1
00ac81d8	b.lt 0x00ac8204
00ac81dc	cbz x0,0x00ac8204
00ac81e0	sxtw x5,w20
00ac81e4	mov x4,x19
00ac81e8	ldp x29,x30,[sp, #0x20]
00ac81ec	ldp x20,x19,[sp, #0x10]
00ac81f0	mov w1,wzr
00ac81f4	mov x2,xzr
00ac81f8	mov x3,xzr
00ac81fc	ldr d8,[sp], #0x30
00ac8200	b 0x00c3d1c0
00ac8204	ldp x29,x30,[sp, #0x20]
00ac8208	ldp x20,x19,[sp, #0x10]
00ac820c	ldr d8,[sp], #0x30
00ac8210	ret
