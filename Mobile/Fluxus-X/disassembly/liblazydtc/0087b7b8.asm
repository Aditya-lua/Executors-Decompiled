; FUN_0087b7b8 @ 0087b7b8
0087b7b8	ldr x8,[x0, #0x28]
0087b7bc	cbz x8,0x0087b834
0087b7c0	stp x29,x30,[sp, #-0x20]!
0087b7c4	str x19,[sp, #0x10]
0087b7c8	mov x29,sp
0087b7cc	ldr x8,[x0, #0x20]
0087b7d0	mov x19,x0
0087b7d4	cmp x8,x1
0087b7d8	b.ls 0x0087b810
0087b7dc	ldr x0,[x19]
0087b7e0	bl 0x00c301d0
0087b7e4	ldr x0,[x19, #0x18]
0087b7e8	str xzr,[x19]
0087b7ec	bl 0x00c301d0
0087b7f0	mov x0,xzr
0087b7f4	stp xzr,xzr,[x19, #0x8]
0087b7f8	str xzr,[x19, #0x18]
0087b7fc	bl 0x00c301d0
0087b800	mov w8,#0x40
0087b804	str xzr,[x19, #0x20]
0087b808	strb w8,[x19, #0x30]
0087b80c	b 0x0087b828
0087b810	ldr x8,[x19, #0x10]
0087b814	cbz x8,0x0087b828
0087b818	ldr x0,[x19, #0x18]
0087b81c	lsl x2,x8,#0x3
0087b820	mov w1,wzr
0087b824	bl 0x00c301c0
0087b828	str xzr,[x19, #0x28]
0087b82c	ldr x19,[sp, #0x10]
0087b830	ldp x29,x30,[sp], #0x20
0087b834	ret
