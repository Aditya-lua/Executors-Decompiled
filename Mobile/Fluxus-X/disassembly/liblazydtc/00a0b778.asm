; BN_sub_word @ 00a0b778
00a0b778	stp x20,x19,[sp, #-0x20]!
00a0b77c	stp x29,x30,[sp, #0x10]
00a0b780	add x29,sp,#0x10
00a0b784	cbz x1,0x00a0b850
00a0b788	mov x20,x1
00a0b78c	mov x19,x0
00a0b790	bl 0x00c369b0
00a0b794	cbz w0,0x00a0b7bc
00a0b798	mov x0,x19
00a0b79c	mov x1,x20
00a0b7a0	bl 0x00c37720
00a0b7a4	mov w20,w0
00a0b7a8	cbz w0,0x00a0b854
00a0b7ac	mov w1,#0x1
00a0b7b0	mov x0,x19
00a0b7b4	bl 0x00c37f50
00a0b7b8	b 0x00a0b854
00a0b7bc	ldr w8,[x19, #0x10]
00a0b7c0	cbz w8,0x00a0b7e0
00a0b7c4	mov x0,x19
00a0b7c8	mov x1,x20
00a0b7cc	str wzr,[x19, #0x10]
00a0b7d0	bl 0x00a0b67c
00a0b7d4	mov w8,#0x1
00a0b7d8	str w8,[x19, #0x10]
00a0b7dc	b 0x00a0b858
00a0b7e0	ldr x11,[x19]
00a0b7e4	ldr w8,[x19, #0x8]
00a0b7e8	ldr x9,[x11]
00a0b7ec	subs w8,w8,#0x1
00a0b7f0	b.ne 0x00a0b810
00a0b7f4	cmp x9,x20
00a0b7f8	b.cs 0x00a0b810
00a0b7fc	sub x8,x20,x9
00a0b800	mov w20,#0x1
00a0b804	str x8,[x11]
00a0b808	str w20,[x19, #0x10]
00a0b80c	b 0x00a0b854
00a0b810	subs x10,x9,x20
00a0b814	mov x9,xzr
00a0b818	str x10,[x11]
00a0b81c	b.cs 0x00a0b83c
00a0b820	add x11,x11,#0x8
00a0b824	lsl x12,x9,#0x3
00a0b828	ldr x13,[x11, x12#0x0]
00a0b82c	add x9,x9,#0x1
00a0b830	sub x10,x13,#0x1
00a0b834	str x10,[x11, x12#0x0]
00a0b838	cbz x13,0x00a0b824
00a0b83c	mov w20,#0x1
00a0b840	cbnz x10,0x00a0b854
00a0b844	cmp w8,w9
00a0b848	b.ne 0x00a0b854
00a0b84c	str w9,[x19, #0x8]
00a0b850	mov w20,#0x1
00a0b854	mov w0,w20
00a0b858	ldp x29,x30,[sp, #0x10]
00a0b85c	ldp x20,x19,[sp], #0x20
00a0b860	ret
