; FUN_0083bfe0 @ 0083bfe0
0083bfe0	stp x29,x30,[sp, #-0x50]!
0083bfe4	stp x26,x25,[sp, #0x10]
0083bfe8	stp x24,x23,[sp, #0x20]
0083bfec	stp x22,x21,[sp, #0x30]
0083bff0	stp x20,x19,[sp, #0x40]
0083bff4	mov x29,sp
0083bff8	ldp x25,x8,[x0, #0x8]
0083bffc	mov x19,x0
0083c000	mov x23,x1
0083c004	cmp x25,x8
0083c008	b.cs 0x0083c018
0083c00c	ldr x8,[x23]
0083c010	str x8,[x25], #0x8
0083c014	b 0x0083c0a0
0083c018	ldr x20,[x19]
0083c01c	sub x22,x25,x20
0083c020	asr x26,x22,#0x3
0083c024	add x9,x26,#0x1
0083c028	lsr x10,x9,#0x3d
0083c02c	cbnz x10,0x0083c0bc
0083c030	sub x21,x8,x20
0083c034	orr x10,xzr,#0x7ffffffffffffff8
0083c038	asr x8,x21,#0x2
0083c03c	cmp x8,x9
0083c040	csel x8,x8,x9,hi
0083c044	cmp x21,x10
0083c048	mov x9,#0x1fffffffffffffff
0083c04c	csel x8,x8,x9,cc
0083c050	lsr x9,x8,#0x3d
0083c054	cbnz x9,0x0083c0c0
0083c058	lsl x24,x8,#0x3
0083c05c	mov x0,x24
0083c060	bl 0x00c2fed0
0083c064	add x25,x0,x22
0083c068	ldr x8,[x23]
0083c06c	add x24,x0,x24
0083c070	sub x23,x25,x26, LSL #0x3
0083c074	mov x1,x20
0083c078	mov x2,x22
0083c07c	str x8,[x25], #0x8
0083c080	mov x0,x23
0083c084	bl 0x00c2ffd0
0083c088	stp x23,x25,[x19]
0083c08c	str x24,[x19, #0x10]
0083c090	cbz x20,0x0083c0a0
0083c094	mov x0,x20
0083c098	mov x1,x21
0083c09c	bl 0x00c2fe80
0083c0a0	str x25,[x19, #0x8]
0083c0a4	ldp x20,x19,[sp, #0x40]
0083c0a8	ldp x22,x21,[sp, #0x30]
0083c0ac	ldp x24,x23,[sp, #0x20]
0083c0b0	ldp x26,x25,[sp, #0x10]
0083c0b4	ldp x29,x30,[sp], #0x50
0083c0b8	ret
0083c0bc	bl 0x0083c0c4
0083c0c0	bl 0x007fe1b8
