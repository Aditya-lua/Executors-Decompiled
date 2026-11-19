; FUN_00bfa8f8 @ 00bfa8f8
00bfa8f8	paciasp
00bfa8fc	sub sp,sp,#0x60
00bfa900	stp x29,x30,[sp, #0x10]
00bfa904	stp x26,x25,[sp, #0x20]
00bfa908	stp x24,x23,[sp, #0x30]
00bfa90c	stp x22,x21,[sp, #0x40]
00bfa910	stp x20,x19,[sp, #0x50]
00bfa914	add x29,sp,#0x10
00bfa918	ldp x10,x9,[x1, #0x10]
00bfa91c	mov x8,#-0x1
00bfa920	adrp x11,0xcad000
00bfa924	add x11,x11,#0x530
00bfa928	mov x21,x0
00bfa92c	stp x11,x8,[x0]
00bfa930	mov w11,#0x1e
00bfa934	mov x20,x0
00bfa938	sub x8,x9,x10
00bfa93c	str xzr,[x20, #0x10]!
00bfa940	asr x9,x8,#0x3
00bfa944	stp xzr,xzr,[x0, #0x18]
00bfa948	str xzr,[x0, #0x118]
00bfa94c	add x8,x9,#0x1
00bfa950	str x20,[sp]
00bfa954	lsr x10,x8,#0x3d
00bfa958	cmp x8,#0x1e
00bfa95c	strb wzr,[sp, #0x8]
00bfa960	csinc x26,x11,x9,ls
00bfa964	cbnz x10,0x00bfab1c
00bfa968	mov x22,x3
00bfa96c	mov x19,x2
00bfa970	mov x23,x1
00bfa974	cmp x8,#0x1e
00bfa978	b.ls 0x00bfa990
00bfa97c	lsl x24,x8,#0x3
00bfa980	mov x0,x24
00bfa984	bl 0x00c2fed0
00bfa988	mov x25,x0
00bfa98c	b 0x00bfa9a0
00bfa990	mov w8,#0x1
00bfa994	add x25,x21,#0x28
00bfa998	mov w24,#0xf0
00bfa99c	strb w8,[x21, #0x118]
00bfa9a0	add x8,x25,x26, LSL #0x3
00bfa9a4	mov x0,x25
00bfa9a8	mov w1,wzr
00bfa9ac	mov x2,x24
00bfa9b0	str x25,[x21, #0x10]
00bfa9b4	str x8,[x21, #0x20]
00bfa9b8	bl 0x00c301c0
00bfa9bc	add x8,x25,x24
00bfa9c0	mov w9,#0x2a02
00bfa9c4	add x1,x19,#0x8
00bfa9c8	mov w0,#0x1
00bfa9cc	str x8,[x21, #0x18]
00bfa9d0	strh w9,[x21, #0x120]
00bfa9d4	strb wzr,[x21, #0x122]
00bfa9d8	bl 0x00c2bce0
00bfa9dc	cmp x21,x23
00bfa9e0	b.eq 0x00bfa9f8
00bfa9e4	ldp x1,x2,[x23, #0x10]
00bfa9e8	sub x8,x2,x1
00bfa9ec	asr x3,x8,#0x3
00bfa9f0	mov x0,x20
00bfa9f4	bl 0x00c0b578
00bfa9f8	ldp x9,x8,[x23, #0x10]
00bfa9fc	cmp x8,x9
00bfaa00	b.eq 0x00bfaa44
00bfaa04	mov x10,xzr
00bfaa08	mov w24,#0x1
00bfaa0c	b 0x00bfaa24
00bfaa10	mov w10,w24
00bfaa14	sub x11,x8,x9
00bfaa18	add w24,w24,#0x1
00bfaa1c	cmp x10,x11, ASR #0x3
00bfaa20	b.cs 0x00bfaa44
00bfaa24	ldr x11,[x20]
00bfaa28	ldr x10,[x11, x10, LSL #0x3]
00bfaa2c	cbz x10,0x00bfaa10
00bfaa30	add x1,x10,#0x8
00bfaa34	mov w0,#0x1
00bfaa38	bl 0x00c2bce0
00bfaa3c	ldp x9,x8,[x23, #0x10]
00bfaa40	b 0x00bfaa10
00bfaa44	add x1,x19,#0x8
00bfaa48	mov w0,#0x1
00bfaa4c	bl 0x00c2bce0
00bfaa50	ldp x8,x9,[x21, #0x10]
00bfaa54	sub x9,x9,x8
00bfaa58	asr x10,x9,#0x3
00bfaa5c	cmp x22,x10
00bfaa60	b.cc 0x00bfaa8c
00bfaa64	add x9,x22,#0x1
00bfaa68	subs x1,x9,x10
00bfaa6c	b.ls 0x00bfaa80
00bfaa70	mov x0,x20
00bfaa74	bl 0x00c0b6e4
00bfaa78	ldr x8,[x20]
00bfaa7c	b 0x00bfaa8c
00bfaa80	b.cs 0x00bfaa8c
00bfaa84	add x9,x8,x9, LSL #0x3
00bfaa88	str x9,[x21, #0x18]
00bfaa8c	ldr x21,[x8, x22, LSL #0x3]
00bfaa90	cbz x21,0x00bfaab4
00bfaa94	add x1,x21,#0x8
00bfaa98	mov x0,#-0x1
00bfaa9c	bl 0x00c2bd10
00bfaaa0	cbnz x0,0x00bfaab4
00bfaaa4	ldr x8,[x21]
00bfaaa8	mov x0,x21
00bfaaac	ldr x8,[x8, #0x10]
00bfaab0	blr x8
00bfaab4	ldr x8,[x20]
00bfaab8	str x19,[x8, x22, LSL #0x3]
00bfaabc	cbz x19,0x00bfaad0
00bfaac0	add x1,x19,#0x8
00bfaac4	mov x0,#-0x1
00bfaac8	bl 0x00c2bd10
00bfaacc	cbz x0,0x00bfaaf0
00bfaad0	ldp x20,x19,[sp, #0x50]
00bfaad4	ldp x22,x21,[sp, #0x40]
00bfaad8	ldp x24,x23,[sp, #0x30]
00bfaadc	ldp x26,x25,[sp, #0x20]
00bfaae0	ldp x29,x30,[sp, #0x10]
00bfaae4	add sp,sp,#0x60
00bfaae8	autiasp
00bfaaec	ret
00bfaaf0	ldr x8,[x19]
00bfaaf4	ldr x16,[x8, #0x10]
00bfaaf8	mov x0,x19
00bfaafc	ldp x20,x19,[sp, #0x50]
00bfab00	ldp x22,x21,[sp, #0x40]
00bfab04	ldp x24,x23,[sp, #0x30]
00bfab08	ldp x26,x25,[sp, #0x20]
00bfab0c	ldp x29,x30,[sp, #0x10]
00bfab10	add sp,sp,#0x60
00bfab14	autiasp
00bfab18	br x16
00bfab1c	bl 0x00c0b52c
00bfab20	mov x22,x0
00bfab24	cbz x19,0x00bfab74
00bfab28	add x1,x19,#0x8
00bfab2c	mov x0,#-0x1
00bfab30	bl 0x00c2bd10
00bfab34	cbnz x0,0x00bfab54
00bfab38	ldr x8,[x19]
00bfab3c	mov x0,x19
00bfab40	ldr x8,[x8, #0x10]
00bfab44	blr x8
00bfab48	b 0x00bfab54
00bfab54	add x1,x19,#0x8
00bfab58	mov x0,#-0x1
00bfab5c	bl 0x00c2bd10
00bfab60	cbnz x0,0x00bfab74
00bfab64	ldr x8,[x19]
00bfab68	mov x0,x19
00bfab6c	ldr x8,[x8, #0x10]
00bfab70	blr x8
00bfab74	ldrb w8,[x21, #0x120]
00bfab78	tbz w8,#0x0,0x00bfab8c
00bfab7c	ldr x8,[x21, #0x120]
00bfab80	ldr x0,[x21, #0x130]
00bfab84	and x1,x8,#-0x2
00bfab88	bl 0x00c2fe80
00bfab8c	mov x0,x20
00bfab90	bl 0x00bf5288
00bfab94	b 0x00bfaba4
00bfaba4	mov x0,x21
00bfaba8	bl 0x00c31530
00bfabac	mov x0,x22
00bfabb0	bl 0x00c2c090
