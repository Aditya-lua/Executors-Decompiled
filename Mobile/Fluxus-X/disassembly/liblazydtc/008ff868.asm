; cpr::util::parseHeader @ 008ff868
008ff868	stp x28,x27,[sp, #-0x60]!
008ff86c	stp x26,x25,[sp, #0x10]
008ff870	stp x24,x23,[sp, #0x20]
008ff874	stp x22,x21,[sp, #0x30]
008ff878	stp x20,x19,[sp, #0x40]
008ff87c	stp x29,x30,[sp, #0x50]
008ff880	add x29,sp,#0x50
008ff884	sub sp,sp,#0x1f0
008ff888	adrp x11,0xcb4000
008ff88c	str x2,[sp, #0x30]
008ff890	mrs x22,tpidr_el0
008ff894	ldr x11,[x11, #0xd78]
008ff898	ldr x9,[x22, #0x28]
008ff89c	add x20,sp,#0xc0
008ff8a0	mov x12,x8
008ff8a4	movi v0.2D,#0x0
008ff8a8	add x10,x11,#0x18
008ff8ac	mov x28,x1
008ff8b0	mov x24,x0
008ff8b4	add x19,x20,#0x78
008ff8b8	mov v0.D[0x0],x10
008ff8bc	add x25,x20,#0x10
008ff8c0	add x10,x11,#0x40
008ff8c4	str x9,[sp, #0x60]
008ff8c8	str xzr,[x12, #0x8]!
008ff8cc	str xzr,[x8, #0x10]
008ff8d0	stp xzr,xzr,[sp, #0x98]
008ff8d4	str xzr,[sp, #0xa8]
008ff8d8	str x10,[sp, #0x138]
008ff8dc	str x8,[sp, #0x50]
008ff8e0	str x12,[sp, #0x38]
008ff8e4	str x12,[x8]
008ff8e8	str q0,[sp, #0xc0]
008ff8ec	mov x0,x19
008ff8f0	mov x1,x25
008ff8f4	bl 0x00c30100
008ff8f8	str xzr,[sp, #0x1c0]
008ff8fc	adrp x9,0xcb4000
008ff900	adrp x23,0xcb4000
008ff904	ldr x9,[x9, #0xd80]
008ff908	ldr x23,[x23, #0xa08]
008ff90c	mov w8,#0xffffffff
008ff910	add x21,x20,#0x18
008ff914	str w8,[sp, #0x1c8]
008ff918	add x8,x9,#0x18
008ff91c	add x9,x9,#0x40
008ff920	add x10,x23,#0x10
008ff924	mov x0,x21
008ff928	str x8,[sp, #0xc0]
008ff92c	str x9,[sp, #0x138]
008ff930	str x10,[sp, #0xd0]
008ff934	bl 0x00c30480
008ff938	movi v0.2D,#0x0
008ff93c	stp q0,q0,[x20, #0x30]
008ff940	str q0,[sp, #0xe0]
008ff944	adrp x9,0xcb4000
008ff948	ldr x9,[x9, #0xa00]
008ff94c	mov w8,#0x8
008ff950	add x9,x9,#0x10
008ff954	str x9,[sp, #0xd0]
008ff958	stp q0,q0,[x20, #0x50]
008ff95c	str w8,[sp, #0x130]
008ff960	mov x0,x25
008ff964	mov x1,x24
008ff968	bl 0x00c319e0
008ff96c	mov w20,#0x5
008ff970	stp xzr,xzr,[sp, #0x80]
008ff974	str xzr,[sp, #0x90]
008ff978	b 0x008ff988
008ff97c	ldr x8,[sp, #0xa0]
008ff980	add x8,x8,#0x18
008ff984	str x8,[sp, #0xa0]
008ff988	add x0,sp,#0xc0
008ff98c	add x1,sp,#0x80
008ff990	mov w2,#0xa
008ff994	bl 0x00c31a20
008ff998	ldr x8,[x0]
008ff99c	ldur x8,[x8, #-0x18]
008ff9a0	add x8,x0,x8
008ff9a4	ldrb w8,[x8, #0x20]
008ff9a8	tst w8,w20
008ff9ac	b.ne 0x008ffa50
008ff9b0	ldp x24,x8,[sp, #0xa0]
008ff9b4	cmp x24,x8
008ff9b8	b.eq 0x008ff9e0
008ff9bc	stp xzr,xzr,[x24, #0x8]
008ff9c0	str xzr,[x24]
008ff9c4	ldrb w8,[sp, #0x80]
008ff9c8	tbnz w8,#0x0,0x008ff9f0
008ff9cc	ldr x8,[sp, #0x90]
008ff9d0	str x8,[x24, #0x10]
008ff9d4	ldr q0,[sp, #0x80]
008ff9d8	str q0,[x24]
008ff9dc	b 0x008ff97c
008ff9e0	add x0,sp,#0x98
008ff9e4	add x1,sp,#0x80
008ff9e8	bl 0x00c30dd0
008ff9ec	b 0x008ff988
008ff9f0	ldr x25,[sp, #0x88]
008ff9f4	cmn x25,#0x10
008ff9f8	b.cs 0x009001d0
008ff9fc	ldr x26,[sp, #0x90]
008ffa00	cmp x25,#0x17
008ffa04	b.cs 0x008ffa18
008ffa08	lsl w8,w25,#0x1
008ffa0c	strb w8,[x24], #0x1
008ffa10	cbnz x25,0x008ffa38
008ffa14	b 0x008ffa48
008ffa18	add x8,x25,#0x10
008ffa1c	and x27,x8,#-0x10
008ffa20	mov x0,x27
008ffa24	bl 0x00c2fed0
008ffa28	orr x8,x27,#0x1
008ffa2c	stp x25,x0,[x24, #0x8]
008ffa30	str x8,[x24]
008ffa34	mov x24,x0
008ffa38	mov x0,x24
008ffa3c	mov x1,x26
008ffa40	mov x2,x25
008ffa44	bl 0x00c2ffd0
008ffa48	strb wzr,[x24, x25]
008ffa4c	b 0x008ff97c
008ffa50	ldrb w8,[sp, #0x80]
008ffa54	str x28,[sp, #0x48]
008ffa58	stp x22,x21,[sp, #0x10]
008ffa5c	str x19,[sp, #0x20]
008ffa60	tbz w8,#0x0,0x008ffa6c
008ffa64	ldr x0,[sp, #0x90]
008ffa68	bl 0x00c301d0
008ffa6c	ldp x24,x8,[sp, #0x98]
008ffa70	cmp x24,x8
008ffa74	str x8,[sp, #0x40]
008ffa78	b.eq 0x009000f0
008ffa7c	ldr x8,[sp, #0x30]
008ffa80	ldr x9,[sp, #0x48]
008ffa84	add x10,sp,#0x80
008ffa88	orr x10,x10,#0x1
008ffa8c	mov x21,#0x100000001
008ffa90	orr x8,x9,x8
008ffa94	cmp x9,#0x0
008ffa98	add x9,sp,#0x68
008ffa9c	str x10,[sp, #0x58]
008ffaa0	cset w10,eq
008ffaa4	cmp x8,#0x0
008ffaa8	orr x8,x9,#0x1
008ffaac	movk x21,#0x2600
008ffab0	mov w23,#0x1
008ffab4	str x8,[sp, #0x8]
008ffab8	cset w8,ne
008ffabc	stp w10,w8,[sp, #0x28]
008ffac0	stp xzr,xzr,[sp, #0x88]
008ffac4	str xzr,[sp, #0x80]
008ffac8	ldrb w8,[x24]
008ffacc	ldp x9,x10,[x24, #0x8]
008ffad0	lsr w11,w8,#0x1
008ffad4	tst w8,#0x1
008ffad8	csel x8,x11,x9,eq
008ffadc	csinc x28,x10,x24,ne
008ffae0	cmp x8,#0x5
008ffae4	mov w9,#0x5
008ffae8	csel x27,x8,x9,cc
008ffaec	cmn x27,#0x10
008ffaf0	b.cs 0x009001c8
008ffaf4	cmp x27,#0x17
008ffaf8	b.cs 0x008ffb10
008ffafc	ldr x26,[sp, #0x58]
008ffb00	lsl w8,w27,#0x1
008ffb04	strb w8,[sp, #0x80]
008ffb08	cbnz x27,0x008ffb28
008ffb0c	b 0x008ffb38
008ffb10	mov w0,#0x10
008ffb14	bl 0x00c2fed0
008ffb18	mov w8,#0x11
008ffb1c	mov x26,x0
008ffb20	stp x27,x0,[sp, #0x88]
008ffb24	str x8,[sp, #0x80]
008ffb28	mov x0,x26
008ffb2c	mov x1,x28
008ffb30	mov x2,x27
008ffb34	bl 0x00c2ffd0
008ffb38	strb wzr,[x26, x27]
008ffb3c	ldrb w19,[sp, #0x80]
008ffb40	ldr x8,[sp, #0x88]
008ffb44	mov w20,wzr
008ffb48	lsr w9,w19,#0x1
008ffb4c	tst w19,#0x1
008ffb50	csel x8,x9,x8,eq
008ffb54	cmp x8,#0x5
008ffb58	b.ne 0x008ffb84
008ffb5c	ldr x8,[sp, #0x90]
008ffb60	ldr x9,[sp, #0x58]
008ffb64	tst w19,#0x1
008ffb68	adrp x1,0x2ce000
008ffb6c	mov w2,#0x5
008ffb70	csel x0,x9,x8,eq
008ffb74	add x1,x1,#0xe92
008ffb78	bl 0x00c300b0
008ffb7c	cmp w0,#0x0
008ffb80	cset w20,eq
008ffb84	ldr x22,[sp, #0x48]
008ffb88	add x25,x24,#0x1
008ffb8c	tbz w19,#0x0,0x008ffb98
008ffb90	ldr x0,[sp, #0x90]
008ffb94	bl 0x00c301d0
008ffb98	cbz w20,0x008ffdd4
008ffb9c	ldr w8,[sp, #0x2c]
008ffba0	cbz w8,0x008ffdb8
008ffba4	ldrb w8,[x24]
008ffba8	tbnz w8,#0x0,0x008ffbb8
008ffbac	lsr w9,w8,#0x1
008ffbb0	mov x11,x25
008ffbb4	b 0x008ffbbc
008ffbb8	ldp x9,x11,[x24, #0x8]
008ffbbc	mov x10,x9
008ffbc0	cbz x10,0x008ffbe8
008ffbc4	add x12,x11,x10
008ffbc8	ldurb w12,[x12, #-0x1]
008ffbcc	sub x10,x10,#0x1
008ffbd0	cmp x12,#0x3f
008ffbd4	b.hi 0x008ffbec
008ffbd8	lsl x12,x23,x12
008ffbdc	and x12,x12,x21
008ffbe0	cbnz x12,0x008ffbc0
008ffbe4	b 0x008ffbec
008ffbe8	mov x10,#-0x1
008ffbec	add x11,x10,#0x1
008ffbf0	cmp x11,x9
008ffbf4	csinc x9,x9,x10,cs
008ffbf8	tbnz w8,#0x0,0x008ffc20
008ffbfc	lsr w10,w8,#0x1
008ffc00	subs x1,x9,x10
008ffc04	b.hi 0x008ffc2c
008ffc08	tbnz w8,#0x0,0x008ffc3c
008ffc0c	add x8,x24,x9
008ffc10	lsl w9,w9,#0x1
008ffc14	strb wzr,[x8, #0x1]
008ffc18	strb w9,[x24]
008ffc1c	b 0x008ffc48
008ffc20	ldr x10,[x24, #0x8]
008ffc24	subs x1,x9,x10
008ffc28	b.ls 0x008ffc08
008ffc2c	mov x0,x24
008ffc30	mov w2,wzr
008ffc34	bl 0x00c30250
008ffc38	b 0x008ffc48
008ffc3c	ldr x8,[x24, #0x10]
008ffc40	strb wzr,[x8, x9]
008ffc44	str x9,[x24, #0x8]
008ffc48	ldr w9,[sp, #0x28]
008ffc4c	cmp x24,x22
008ffc50	cset w8,eq
008ffc54	orr w8,w8,w9
008ffc58	tbnz w8,#0x0,0x008ffc7c
008ffc5c	ldrb w8,[x24]
008ffc60	ldp x10,x9,[x24, #0x8]
008ffc64	tst w8,#0x1
008ffc68	lsr w11,w8,#0x1
008ffc6c	csel x1,x25,x9,eq
008ffc70	csel x2,x11,x10,eq
008ffc74	mov x0,x22
008ffc78	bl 0x00c31090
008ffc7c	ldr x8,[sp, #0x30]
008ffc80	cbz x8,0x008ffdb8
008ffc84	ldrb w8,[x24]
008ffc88	tbnz w8,#0x0,0x008ffc9c
008ffc8c	lsr w9,w8,#0x1
008ffc90	mov x10,x25
008ffc94	cbnz x9,0x008ffca4
008ffc98	b 0x008ffdb8
008ffc9c	ldp x9,x10,[x24, #0x8]
008ffca0	cbz x9,0x008ffdb8
008ffca4	mov x11,xzr
008ffca8	ldrb w12,[x10, x11]
008ffcac	cmp w12,#0x20
008ffcb0	b.eq 0x008ffccc
008ffcb4	cmp w12,#0x9
008ffcb8	b.eq 0x008ffccc
008ffcbc	add x11,x11,#0x1
008ffcc0	cmp x9,x11
008ffcc4	b.ne 0x008ffca8
008ffcc8	b 0x008ffdb8
008ffccc	cmp x9,x11
008ffcd0	b.eq 0x008ffdb8
008ffcd4	cmn x11,#0x1
008ffcd8	b.eq 0x008ffdb8
008ffcdc	add x9,x11,#0x1
008ffce0	tbnz w8,#0x0,0x008ffcf8
008ffce4	lsr w10,w8,#0x1
008ffce8	mov x11,x25
008ffcec	cmp x10,x9
008ffcf0	b.hi 0x008ffd04
008ffcf4	b 0x008ffdb8
008ffcf8	ldp x10,x11,[x24, #0x8]
008ffcfc	cmp x10,x9
008ffd00	b.ls 0x008ffdb8
008ffd04	ldrb w12,[x11, x9]
008ffd08	cmp w12,#0x20
008ffd0c	b.eq 0x008ffd28
008ffd10	cmp w12,#0x9
008ffd14	b.eq 0x008ffd28
008ffd18	add x9,x9,#0x1
008ffd1c	cmp x10,x9
008ffd20	b.ne 0x008ffd04
008ffd24	b 0x008ffdb8
008ffd28	cmp x10,x9
008ffd2c	b.eq 0x008ffdb8
008ffd30	cmn x9,#0x1
008ffd34	b.eq 0x008ffdb8
008ffd38	add x9,x9,#0x1
008ffd3c	tbnz w8,#0x0,0x008ffd4c
008ffd40	lsr w10,w8,#0x1
008ffd44	mov x27,x25
008ffd48	b 0x008ffd50
008ffd4c	ldp x10,x27,[x24, #0x8]
008ffd50	cmp x10,x9
008ffd54	csel x9,x10,x9,cc
008ffd58	subs x28,x10,x9
008ffd5c	b.eq 0x008ffd74
008ffd60	add x1,x27,x9
008ffd64	mov x0,x27
008ffd68	mov x2,x28
008ffd6c	bl 0x00c2ff60
008ffd70	ldrb w8,[x24]
008ffd74	tbnz w8,#0x0,0x008ffd84
008ffd78	lsl w8,w28,#0x1
008ffd7c	strb w8,[x24]
008ffd80	b 0x008ffd88
008ffd84	str x28,[x24, #0x8]
008ffd88	ldr x8,[sp, #0x30]
008ffd8c	strb wzr,[x27, x28]
008ffd90	cmp x24,x8
008ffd94	b.eq 0x008ffdb8
008ffd98	ldrb w8,[x24]
008ffd9c	ldp x10,x9,[x24, #0x8]
008ffda0	tst w8,#0x1
008ffda4	lsr w11,w8,#0x1
008ffda8	csel x1,x25,x9,eq
008ffdac	csel x2,x11,x10,eq
008ffdb0	ldr x0,[sp, #0x30]
008ffdb4	bl 0x00c31090
008ffdb8	ldr x19,[sp, #0x50]
008ffdbc	ldr x1,[x19, #0x8]
008ffdc0	mov x0,x19
008ffdc4	bl 0x00827168
008ffdc8	ldr x8,[sp, #0x38]
008ffdcc	stp xzr,xzr,[x19, #0x8]
008ffdd0	str x8,[x19]
008ffdd4	ldrb w28,[x24]
008ffdd8	tbnz w28,#0x0,0x008ffdf8
008ffddc	lsr w8,w28,#0x1
008ffde0	cbz x8,0x009000e0
008ffde4	tbnz w28,#0x0,0x008ffe04
008ffde8	lsr w2,w28,#0x1
008ffdec	mov x26,x25
008ffdf0	cbnz x2,0x008ffe0c
008ffdf4	b 0x009000e0
008ffdf8	ldr x8,[x24, #0x8]
008ffdfc	cbnz x8,0x008ffde4
008ffe00	b 0x009000e0
008ffe04	ldp x2,x26,[x24, #0x8]
008ffe08	cbz x2,0x009000e0
008ffe0c	mov w1,#0x3a
008ffe10	mov x0,x26
008ffe14	bl 0x00c300a0
008ffe18	cbz x0,0x009000e0
008ffe1c	sub x22,x0,x26
008ffe20	cmn x22,#0x1
008ffe24	b.eq 0x009000e0
008ffe28	stp xzr,xzr,[sp, #0x80]
008ffe2c	str xzr,[sp, #0x90]
008ffe30	ldr x8,[x24, #0x8]
008ffe34	lsr w9,w28,#0x1
008ffe38	tst w28,#0x1
008ffe3c	add x20,x22,#0x1
008ffe40	csel x8,x9,x8,eq
008ffe44	subs x27,x8,x20
008ffe48	b.cc 0x009001d8
008ffe4c	ldr x8,[x24, #0x10]
008ffe50	tst w28,#0x1
008ffe54	csel x19,x25,x8,eq
008ffe58	cmn x27,#0x10
008ffe5c	b.cs 0x009001e0
008ffe60	cmp x27,#0x17
008ffe64	b.cs 0x008ffe7c
008ffe68	ldr x28,[sp, #0x58]
008ffe6c	lsl w8,w27,#0x1
008ffe70	strb w8,[sp, #0x80]
008ffe74	cbnz x27,0x008ffe9c
008ffe78	b 0x008ffeac
008ffe7c	add x8,x27,#0x10
008ffe80	and x26,x8,#-0x10
008ffe84	mov x0,x26
008ffe88	bl 0x00c2fed0
008ffe8c	orr x8,x26,#0x1
008ffe90	mov x28,x0
008ffe94	stp x27,x0,[sp, #0x88]
008ffe98	str x8,[sp, #0x80]
008ffe9c	add x1,x19,x20
008ffea0	mov x0,x28
008ffea4	mov x2,x27
008ffea8	bl 0x00c2ffd0
008ffeac	strb wzr,[x28, x27]
008ffeb0	ldrb w8,[sp, #0x80]
008ffeb4	ldp x9,x10,[sp, #0x88]
008ffeb8	lsr w11,w8,#0x1
008ffebc	tst w8,#0x1
008ffec0	csel x9,x11,x9,eq
008ffec4	ldr x11,[sp, #0x58]
008ffec8	csel x27,x11,x10,eq
008ffecc	cbz x9,0x008fff00
008ffed0	mov x12,#0x100000001
008ffed4	mov x10,xzr
008ffed8	movk x12,#0x200
008ffedc	ldrb w11,[x27, x10]
008ffee0	cmp x11,#0x3f
008ffee4	b.hi 0x008fff08
008ffee8	lsl x11,x23,x11
008ffeec	and x11,x11,x12
008ffef0	cbz x11,0x008fff08
008ffef4	add x10,x10,#0x1
008ffef8	cmp x9,x10
008ffefc	b.ne 0x008ffedc
008fff00	mov x10,#-0x1
008fff04	b 0x008fff0c
008fff08	cbz x10,0x008fff4c
008fff0c	cmp x9,x10
008fff10	csel x10,x9,x10,cc
008fff14	subs x28,x9,x10
008fff18	b.eq 0x008fff30
008fff1c	add x1,x27,x10
008fff20	mov x0,x27
008fff24	mov x2,x28
008fff28	bl 0x00c2ff60
008fff2c	ldrb w8,[sp, #0x80]
008fff30	tbnz w8,#0x0,0x008fff40
008fff34	lsl w8,w28,#0x1
008fff38	strb w8,[sp, #0x80]
008fff3c	b 0x008fff44
008fff40	str x28,[sp, #0x88]
008fff44	strb wzr,[x27, x28]
008fff48	ldrb w8,[sp, #0x80]
008fff4c	ldp x10,x11,[sp, #0x88]
008fff50	ldr x12,[sp, #0x58]
008fff54	lsr w9,w8,#0x1
008fff58	tst w8,#0x1
008fff5c	csel x10,x9,x10,eq
008fff60	csel x12,x12,x11,eq
008fff64	mov x11,x10
008fff68	cbz x11,0x008fff90
008fff6c	add x13,x12,x11
008fff70	ldurb w13,[x13, #-0x1]
008fff74	sub x11,x11,#0x1
008fff78	cmp x13,#0x3f
008fff7c	b.hi 0x008fff94
008fff80	lsl x13,x23,x13
008fff84	and x13,x13,x21
008fff88	cbnz x13,0x008fff68
008fff8c	b 0x008fff94
008fff90	mov x11,#-0x1
008fff94	ldr x13,[sp, #0x88]
008fff98	add x12,x11,#0x1
008fff9c	cmp x12,x10
008fffa0	csinc x10,x10,x11,cs
008fffa4	tst w8,#0x1
008fffa8	csel x9,x9,x13,eq
008fffac	subs x1,x10,x9
008fffb0	b.ls 0x008fffc4
008fffb4	add x0,sp,#0x80
008fffb8	mov w2,wzr
008fffbc	bl 0x00c30250
008fffc0	b 0x008fffec
008fffc4	tbnz w8,#0x0,0x008fffe0
008fffc8	add x8,sp,#0x80
008fffcc	add x8,x8,x10
008fffd0	lsl w9,w10,#0x1
008fffd4	strb wzr,[x8, #0x1]
008fffd8	strb w9,[sp, #0x80]
008fffdc	b 0x008fffec
008fffe0	ldr x8,[sp, #0x90]
008fffe4	strb wzr,[x8, x10]
008fffe8	str x10,[sp, #0x88]
008fffec	stp xzr,xzr,[sp, #0x70]
008ffff0	str xzr,[sp, #0x68]
008ffff4	ldrb w8,[x24]
008ffff8	ldp x9,x10,[x24, #0x8]
008ffffc	lsr w11,w8,#0x1
00900000	tst w8,#0x1
00900004	csel x8,x11,x9,eq
00900008	csel x28,x25,x10,eq
0090000c	cmp x8,x22
00900010	csel x27,x8,x22,cc
00900014	cmn x27,#0x10
00900018	b.cs 0x009001e8
0090001c	cmp x27,#0x17
00900020	b.cs 0x00900038
00900024	ldr x26,[sp, #0x8]
00900028	lsl w8,w27,#0x1
0090002c	strb w8,[sp, #0x68]
00900030	cbnz x27,0x00900058
00900034	b 0x00900068
00900038	add x8,x27,#0x10
0090003c	and x25,x8,#-0x10
00900040	mov x0,x25
00900044	bl 0x00c2fed0
00900048	orr x8,x25,#0x1
0090004c	mov x26,x0
00900050	stp x27,x0,[sp, #0x70]
00900054	str x8,[sp, #0x68]
00900058	mov x0,x26
0090005c	mov x1,x28
00900060	mov x2,x27
00900064	bl 0x00c2ffd0
00900068	add x8,sp,#0x68
0090006c	strb wzr,[x26, x27]
00900070	str x8,[sp, #0xb8]
00900074	ldr x0,[sp, #0x50]
00900078	adrp x2,0x746000
0090007c	add x1,sp,#0x68
00900080	add x3,sp,#0xb8
00900084	add x4,sp,#0xb0
00900088	add x2,x2,#0x2d9
0090008c	bl 0x00825c7c
00900090	add x0,x0,#0x38
00900094	add x8,sp,#0x80
00900098	cmp x0,x8
0090009c	b.eq 0x009000c0
009000a0	ldrb w8,[sp, #0x80]
009000a4	ldp x10,x9,[sp, #0x88]
009000a8	lsr w11,w8,#0x1
009000ac	tst w8,#0x1
009000b0	ldr x8,[sp, #0x58]
009000b4	csel x2,x11,x10,eq
009000b8	csel x1,x8,x9,eq
009000bc	bl 0x00c31090
009000c0	ldrb w8,[sp, #0x68]
009000c4	tbz w8,#0x0,0x009000d0
009000c8	ldr x0,[sp, #0x78]
009000cc	bl 0x00c301d0
009000d0	ldrb w8,[sp, #0x80]
009000d4	tbz w8,#0x0,0x009000e0
009000d8	ldr x0,[sp, #0x90]
009000dc	bl 0x00c301d0
009000e0	ldr x8,[sp, #0x40]
009000e4	add x24,x24,#0x18
009000e8	cmp x24,x8
009000ec	b.ne 0x008ffac0
009000f0	adrp x8,0xcb4000
009000f4	ldr x8,[x8, #0xd80]
009000f8	adrp x10,0xcb4000
009000fc	ldr x10,[x10, #0xa00]
00900100	mov x9,x8
00900104	add x8,x8,#0x18
00900108	str x8,[sp, #0xc0]
0090010c	ldrb w8,[sp, #0x110]
00900110	add x9,x9,#0x40
00900114	add x10,x10,#0x10
00900118	str x9,[sp, #0x138]
0090011c	str x10,[sp, #0xd0]
00900120	tbz w8,#0x0,0x0090012c
00900124	ldr x0,[sp, #0x120]
00900128	bl 0x00c301d0
0090012c	adrp x8,0xcb4000
00900130	ldr x8,[x8, #0xa08]
00900134	ldr x0,[sp, #0x18]
00900138	add x8,x8,#0x10
0090013c	str x8,[sp, #0xd0]
00900140	bl 0x00c30090
00900144	ldr x0,[sp, #0x20]
00900148	bl 0x00c30ee0
0090014c	ldr x19,[sp, #0x98]
00900150	ldr x21,[sp, #0x10]
00900154	cbz x19,0x00900198
00900158	ldr x8,[sp, #0xa0]
0090015c	cmp x8,x19
00900160	b.eq 0x0090018c
00900164	mov x20,x8
00900168	ldrb w9,[x20, #-0x18]!
0090016c	tbz w9,#0x0,0x00900178
00900170	ldur x0,[x8, #-0x8]
00900174	bl 0x00c301d0
00900178	cmp x19,x20
0090017c	mov x8,x20
00900180	b.ne 0x00900168
00900184	ldr x0,[sp, #0x98]
00900188	b 0x00900190
0090018c	mov x0,x19
00900190	str x19,[sp, #0xa0]
00900194	bl 0x00c301d0
00900198	ldr x8,[x21, #0x28]
0090019c	ldr x9,[sp, #0x60]
009001a0	cmp x8,x9
009001a4	b.ne 0x009001f0
009001a8	add sp,sp,#0x1f0
009001ac	ldp x29,x30,[sp, #0x50]
009001b0	ldp x20,x19,[sp, #0x40]
009001b4	ldp x22,x21,[sp, #0x30]
009001b8	ldp x24,x23,[sp, #0x20]
009001bc	ldp x26,x25,[sp, #0x10]
009001c0	ldp x28,x27,[sp], #0x60
009001c4	ret
009001c8	add x0,sp,#0x80
009001cc	bl 0x00c30ce0
009001d0	mov x0,x24
009001d4	bl 0x00c30ce0
009001d8	add x0,sp,#0x80
009001dc	bl 0x00c31420
009001e0	add x0,sp,#0x80
009001e4	bl 0x00c30ce0
009001e8	add x0,sp,#0x68
009001ec	bl 0x00c30ce0
009001f0	bl 0x00c2fec0
