; FUN_008ad954 @ 008ad954
008ad954	stp x29,x30,[sp, #-0x30]!
008ad958	str x21,[sp, #0x10]
008ad95c	stp x20,x19,[sp, #0x20]
008ad960	mov x29,sp
008ad964	cmp w1,#0x1
008ad968	mov x19,x0
008ad96c	b.lt 0x008ad9a8
008ad970	ldp x9,x8,[x19, #0x68]
008ad974	add x8,x8,w1, UXTW  #0x4
008ad978	sub x20,x8,#0x10
008ad97c	cmp x20,x9
008ad980	b.cc 0x008ad9cc
008ad984	adrp x8,0xd1f000
008ad988	add x8,x8,#0x1e0
008ad98c	adrp x20,0xd1f000
008ad990	ldarb w8,[x8]
008ad994	tbz w8,#0x0,0x008ada48
008ad998	ldr x8,[x20, #0x1d8]
008ad99c	add x8,x8,#0x7f2, LSL #12
008ad9a0	add x20,x8,#0xef0
008ad9a4	b 0x008ad9cc
008ad9a8	mov w8,#0xffffd8f1
008ad9ac	cmp w1,w8
008ad9b0	b.lt 0x008ad9c0
008ad9b4	ldr x8,[x19, #0x68]
008ad9b8	add x20,x8,w1, SXTW  #0x4
008ad9bc	b 0x008ad9cc
008ad9c0	mov x0,x19
008ad9c4	bl 0x008aea7c
008ad9c8	mov x20,x0
008ad9cc	ldr x1,[x20]
008ad9d0	ldrb w8,[x1, #0x7]
008ad9d4	cbnz w8,0x008ada40
008ad9d8	ldr x21,[x19, #0x68]
008ad9dc	mov x0,x19
008ad9e0	sub x2,x21,#0x20
008ad9e4	bl 0x008bbce8
008ad9e8	ldur q0,[x21, #-0x10]
008ad9ec	str q0,[x0]
008ad9f0	ldr x8,[x19, #0x68]
008ad9f4	ldur w9,[x8, #-0x4]
008ad9f8	cmp w9,#0x5
008ad9fc	b.lt 0x008ada28
008ada00	ldr x1,[x20]
008ada04	ldrb w9,[x1, #0x2]
008ada08	tbz w9,#0x2,0x008ada28
008ada0c	ldur x2,[x8, #-0x10]
008ada10	ldrb w9,[x2, #0x2]
008ada14	tst w9,#0x3
008ada18	b.eq 0x008ada28
008ada1c	mov x0,x19
008ada20	bl 0x008b6370
008ada24	ldr x8,[x19, #0x68]
008ada28	sub x8,x8,#0x20
008ada2c	str x8,[x19, #0x68]
008ada30	ldp x20,x19,[sp, #0x20]
008ada34	ldr x21,[sp, #0x10]
008ada38	ldp x29,x30,[sp], #0x30
008ada3c	ret
008ada40	mov x0,x19
008ada44	bl 0x008b3cec
008ada48	adrp x0,0xd1f000
008ada4c	add x0,x0,#0x1e0
008ada50	bl 0x00c2fe90
008ada54	cbz w0,0x008ad998
008ada58	adrp x8,0xcca000
008ada5c	ldr x0,[x8, #0x8c8]
008ada60	bl 0x007fe1ec
008ada64	str x0,[x20, #0x1d8]
008ada68	adrp x0,0xd1f000
008ada6c	add x0,x0,#0x1e0
008ada70	bl 0x00c2fea0
008ada74	b 0x008ad998
