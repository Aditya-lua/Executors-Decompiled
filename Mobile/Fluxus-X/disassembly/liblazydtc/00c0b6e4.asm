; FUN_00c0b6e4 @ 00c0b6e4
00c0b6e4	paciasp
00c0b6e8	stp x29,x30,[sp, #-0x50]!
00c0b6ec	stp x26,x25,[sp, #0x10]
00c0b6f0	stp x24,x23,[sp, #0x20]
00c0b6f4	stp x22,x21,[sp, #0x30]
00c0b6f8	stp x20,x19,[sp, #0x40]
00c0b6fc	mov x29,sp
00c0b700	ldp x21,x8,[x0, #0x8]
00c0b704	mov x19,x0
00c0b708	sub x9,x8,x21
00c0b70c	cmp x1,x9, ASR #0x3
00c0b710	b.ls 0x00c0b774
00c0b714	ldr x20,[x19]
00c0b718	sub x21,x21,x20
00c0b71c	asr x24,x21,#0x3
00c0b720	add x9,x24,x1
00c0b724	lsr x10,x9,#0x3d
00c0b728	cbnz x10,0x00c0b848
00c0b72c	sub x8,x8,x20
00c0b730	orr x11,xzr,#0x7ffffffffffffff8
00c0b734	add x25,x19,#0x18
00c0b738	asr x10,x8,#0x2
00c0b73c	cmp x10,x9
00c0b740	csel x9,x10,x9,hi
00c0b744	cmp x8,x11
00c0b748	mov x8,#0x1fffffffffffffff
00c0b74c	csel x22,x9,x8,cc
00c0b750	cbz x22,0x00c0b798
00c0b754	cmp x22,#0x1e
00c0b758	b.hi 0x00c0b7a0
00c0b75c	ldrb w8,[x19, #0x108]
00c0b760	tbnz w8,#0x0,0x00c0b7a0
00c0b764	mov w8,#0x1
00c0b768	mov x0,x25
00c0b76c	strb w8,[x19, #0x108]
00c0b770	b 0x00c0b7b8
00c0b774	cbz x1,0x00c0b790
00c0b778	lsl x20,x1,#0x3
00c0b77c	mov x0,x21
00c0b780	mov w1,wzr
00c0b784	mov x2,x20
00c0b788	bl 0x00c301c0
00c0b78c	add x21,x21,x20
00c0b790	str x21,[x19, #0x8]
00c0b794	b 0x00c0b82c
00c0b798	mov x0,xzr
00c0b79c	b 0x00c0b7b8
00c0b7a0	lsr x8,x22,#0x3d
00c0b7a4	cbnz x8,0x00c0b84c
00c0b7a8	lsl x0,x22,#0x3
00c0b7ac	mov x23,x1
00c0b7b0	bl 0x00c2fed0
00c0b7b4	mov x1,x23
00c0b7b8	add x26,x0,x22, LSL #0x3
00c0b7bc	lsl x22,x1,#0x3
00c0b7c0	add x23,x0,x21
00c0b7c4	mov x0,x23
00c0b7c8	mov w1,wzr
00c0b7cc	mov x2,x22
00c0b7d0	bl 0x00c301c0
00c0b7d4	sub x24,x23,x24, LSL #0x3
00c0b7d8	mov x1,x20
00c0b7dc	mov x2,x21
00c0b7e0	add x22,x23,x22
00c0b7e4	mov x0,x24
00c0b7e8	bl 0x00c2ffd0
00c0b7ec	ldr x0,[x19]
00c0b7f0	ldr x8,[x19, #0x10]
00c0b7f4	stp x24,x22,[x19]
00c0b7f8	str x26,[x19, #0x10]
00c0b7fc	cbz x0,0x00c0b82c
00c0b800	cmp x0,x25
00c0b804	b.eq 0x00c0b828
00c0b808	sub x1,x8,x0
00c0b80c	ldp x20,x19,[sp, #0x40]
00c0b810	ldp x22,x21,[sp, #0x30]
00c0b814	ldp x24,x23,[sp, #0x20]
00c0b818	ldp x26,x25,[sp, #0x10]
00c0b81c	ldp x29,x30,[sp], #0x50
00c0b820	autiasp
00c0b824	b 0x00c2fe80
00c0b828	strb wzr,[x19, #0x108]
00c0b82c	ldp x20,x19,[sp, #0x40]
00c0b830	ldp x22,x21,[sp, #0x30]
00c0b834	ldp x24,x23,[sp, #0x20]
00c0b838	ldp x26,x25,[sp, #0x10]
00c0b83c	ldp x29,x30,[sp], #0x50
00c0b840	autiasp
00c0b844	ret
00c0b848	bl 0x00c0b52c
00c0b84c	bl 0x007fe1b8
