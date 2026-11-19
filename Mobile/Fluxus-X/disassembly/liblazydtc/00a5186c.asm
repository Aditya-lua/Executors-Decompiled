; engine_remove_dynamic_id @ 00a5186c
00a5186c	stp x20,x19,[sp, #-0x20]!
00a51870	stp x29,x30,[sp, #0x10]
00a51874	add x29,sp,#0x10
00a51878	cbz x0,0x00a51910
00a5187c	ldr x8,[x0, #0xd8]
00a51880	mov x20,x0
00a51884	cbz x8,0x00a51910
00a51888	mov w19,w1
00a5188c	cbz w1,0x00a518a4
00a51890	adrp x8,0xcb5000
00a51894	ldr x8,[x8, #0x5d8]
00a51898	ldr x0,[x8]
00a5189c	bl 0x00c356a0
00a518a0	cbz w0,0x00a51910
00a518a4	ldr x9,[x20, #0xd0]
00a518a8	str xzr,[x20, #0xd8]
00a518ac	cbz x9,0x00a518b8
00a518b0	ldr x8,[x20, #0xc8]
00a518b4	str x8,[x9, #0xc8]
00a518b8	ldr x8,[x20, #0xc8]
00a518bc	cbz x8,0x00a518c4
00a518c0	str x9,[x8, #0xd0]
00a518c4	adrp x9,0xd21000
00a518c8	ldr x10,[x9, #0x9a8]
00a518cc	cmp x10,x20
00a518d0	b.ne 0x00a518dc
00a518d4	ldr x10,[x20, #0xd0]
00a518d8	str x10,[x9, #0x9a8]
00a518dc	adrp x9,0xd21000
00a518e0	ldr x10,[x9, #0x9b0]
00a518e4	cmp x10,x20
00a518e8	b.eq 0x00a51908
00a518ec	cbz w19,0x00a51910
00a518f0	adrp x8,0xcb5000
00a518f4	ldr x8,[x8, #0x5d8]
00a518f8	ldp x29,x30,[sp, #0x10]
00a518fc	ldr x0,[x8]
00a51900	ldp x20,x19,[sp], #0x20
00a51904	b 0x00c35690
00a51908	str x8,[x9, #0x9b0]
00a5190c	cbnz w19,0x00a518f0
00a51910	ldp x29,x30,[sp, #0x10]
00a51914	ldp x20,x19,[sp], #0x20
00a51918	ret
