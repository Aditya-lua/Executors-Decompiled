; FUN_00bbf92c @ 00bbf92c
00bbf92c	ldp x15,x9,[x2]
00bbf930	sub x10,x1,x0
00bbf934	add x9,x9,x15
00bbf938	cmp x9,x10
00bbf93c	b.ls 0x00bbf948
00bbf940	mov x0,#-0x46
00bbf944	ret
00bbf948	ldr x12,[x3]
00bbf94c	sub x10,x4,x12
00bbf950	cmp x15,x10
00bbf954	b.ls 0x00bbf960
00bbf958	mov x0,#-0x14
00bbf95c	ret
00bbf960	stp x29,x30,[sp, #-0x40]!
00bbf964	stp x24,x23,[sp, #0x10]
00bbf968	stp x22,x21,[sp, #0x20]
00bbf96c	stp x20,x19,[sp, #0x30]
00bbf970	mov x29,sp
00bbf974	ldr x10,[x2, #0x10]
00bbf978	mov x8,x0
00bbf97c	cmp x15,#0x7
00bbf980	add x0,x0,x15
00bbf984	add x11,x12,x15
00bbf988	sub x1,x1,#0x20
00bbf98c	b.hi 0x00bbf9cc
00bbf990	cbz x15,0x00bbfbbc
00bbf994	add x13,x15,x8
00bbf998	add x14,x8,#0x1
00bbf99c	cmp x13,x14
00bbf9a0	csinc x13,x13,x8,hi
00bbf9a4	sub x13,x13,x8
00bbf9a8	cmp x13,#0x8
00bbf9ac	b.cc 0x00bbfa20
00bbf9b0	sub x14,x8,x12
00bbf9b4	cmp x14,#0x20
00bbf9b8	b.cc 0x00bbfa20
00bbf9bc	cmp x13,#0x20
00bbf9c0	b.cs 0x00bbfaa8
00bbf9c4	mov x16,xzr
00bbf9c8	b 0x00bbfae0
00bbf9cc	cmp x0,x1
00bbf9d0	b.ls 0x00bbf9e8
00bbf9d4	cmp x8,x1
00bbf9d8	b.ls 0x00bbfa2c
00bbf9dc	mov x14,x8
00bbf9e0	mov x13,x12
00bbf9e4	b 0x00bbfa6c
00bbf9e8	ldr q0,[x12]
00bbf9ec	cmp x15,#0x11
00bbf9f0	str q0,[x8]
00bbf9f4	b.cc 0x00bbfbbc
00bbf9f8	add x8,x8,#0x10
00bbf9fc	add x12,x12,#0x20
00bbfa00	ldur q0,[x12, #-0x10]
00bbfa04	str q0,[x8]
00bbfa08	ldr q0,[x12], #0x20
00bbfa0c	str q0,[x8, #0x10]
00bbfa10	add x8,x8,#0x20
00bbfa14	cmp x8,x0
00bbfa18	b.cc 0x00bbfa00
00bbfa1c	b 0x00bbfbbc
00bbfa20	mov x14,x12
00bbfa24	mov x15,x8
00bbfa28	b 0x00bbfb90
00bbfa2c	sub x13,x1,x8
00bbfa30	ldr q0,[x12]
00bbfa34	cmp x13,#0x11
00bbfa38	str q0,[x8]
00bbfa3c	b.cc 0x00bbfa64
00bbfa40	add x14,x8,#0x10
00bbfa44	add x16,x12,#0x20
00bbfa48	ldur q0,[x16, #-0x10]
00bbfa4c	str q0,[x14]
00bbfa50	ldr q0,[x16], #0x20
00bbfa54	str q0,[x14, #0x10]
00bbfa58	add x14,x14,#0x20
00bbfa5c	cmp x14,x1
00bbfa60	b.cc 0x00bbfa48
00bbfa64	add x13,x12,x13
00bbfa68	mov x14,x1
00bbfa6c	cmp x14,x0
00bbfa70	b.cs 0x00bbfbbc
00bbfa74	cmp x8,x1
00bbfa78	add x15,x15,x8
00bbfa7c	csel x16,x8,x1,hi
00bbfa80	sub x15,x15,x16
00bbfa84	cmp x15,#0x8
00bbfa88	b.cc 0x00bbfbac
00bbfa8c	sub x17,x8,x12
00bbfa90	cmp x17,#0x20
00bbfa94	b.cc 0x00bbfbac
00bbfa98	cmp x15,#0x20
00bbfa9c	b.cs 0x00bbfb14
00bbfaa0	mov x17,xzr
00bbfaa4	b 0x00bbfb50
00bbfaa8	and x16,x13,#-0x20
00bbfaac	add x14,x8,#0x10
00bbfab0	add x15,x12,#0x10
00bbfab4	mov x17,x16
00bbfab8	ldp q0,q1,[x15, #-0x10]
00bbfabc	subs x17,x17,#0x20
00bbfac0	add x15,x15,#0x20
00bbfac4	stp q0,q1,[x14, #-0x10]
00bbfac8	add x14,x14,#0x20
00bbfacc	b.ne 0x00bbfab8
00bbfad0	cmp x13,x16
00bbfad4	b.eq 0x00bbfbbc
00bbfad8	tst x13,#0x18
00bbfadc	b.eq 0x00bbfb88
00bbfae0	and x17,x13,#-0x8
00bbfae4	add x14,x12,x17
00bbfae8	add x15,x8,x17
00bbfaec	add x8,x8,x16
00bbfaf0	add x12,x12,x16
00bbfaf4	sub x16,x16,x17
00bbfaf8	ldr d0,[x12], #0x8
00bbfafc	adds x16,x16,#0x8
00bbfb00	str d0,[x8], #0x8
00bbfb04	b.ne 0x00bbfaf8
00bbfb08	cmp x13,x17
00bbfb0c	b.ne 0x00bbfb90
00bbfb10	b 0x00bbfbbc
00bbfb14	add x4,x16,#0x10
00bbfb18	and x17,x15,#-0x20
00bbfb1c	sub x19,x4,x8
00bbfb20	mov x20,x17
00bbfb24	add x19,x12,x19
00bbfb28	ldp q0,q1,[x19, #-0x10]
00bbfb2c	subs x20,x20,#0x20
00bbfb30	add x19,x19,#0x20
00bbfb34	stp q0,q1,[x4, #-0x10]
00bbfb38	add x4,x4,#0x20
00bbfb3c	b.ne 0x00bbfb28
00bbfb40	cmp x15,x17
00bbfb44	b.eq 0x00bbfbbc
00bbfb48	tst x15,#0x18
00bbfb4c	b.eq 0x00bbfba4
00bbfb50	add x16,x17,x16
00bbfb54	and x4,x15,#-0x8
00bbfb58	sub x8,x16,x8
00bbfb5c	add x13,x13,x4
00bbfb60	add x14,x14,x4
00bbfb64	add x8,x12,x8
00bbfb68	sub x12,x17,x4
00bbfb6c	ldr d0,[x8], #0x8
00bbfb70	adds x12,x12,#0x8
00bbfb74	str d0,[x16], #0x8
00bbfb78	b.ne 0x00bbfb6c
00bbfb7c	cmp x15,x4
00bbfb80	b.ne 0x00bbfbac
00bbfb84	b 0x00bbfbbc
00bbfb88	add x14,x12,x16
00bbfb8c	add x15,x8,x16
00bbfb90	ldrb w8,[x14], #0x1
00bbfb94	strb w8,[x15], #0x1
00bbfb98	cmp x15,x0
00bbfb9c	b.cc 0x00bbfb90
00bbfba0	b 0x00bbfbbc
00bbfba4	add x13,x13,x17
00bbfba8	add x14,x14,x17
00bbfbac	ldrb w8,[x13], #0x1
00bbfbb0	strb w8,[x14], #0x1
00bbfbb4	cmp x14,x0
00bbfbb8	b.cc 0x00bbfbac
00bbfbbc	ldr x12,[x2, #0x10]
00bbfbc0	sub x8,x0,x5
00bbfbc4	str x11,[x3]
00bbfbc8	cmp x12,x8
00bbfbcc	sub x8,x0,x10
00bbfbd0	b.ls 0x00bbfbe8
00bbfbd4	sub x10,x0,x6
00bbfbd8	cmp x12,x10
00bbfbdc	b.ls 0x00bbfc14
00bbfbe0	mov x0,#-0x14
00bbfbe4	b 0x00bbfc00
00bbfbe8	ldr x3,[x2, #0x8]
00bbfbec	mov x20,x9
00bbfbf0	mov x2,x8
00bbfbf4	mov w4,#0x1
00bbfbf8	bl 0x00bbfc7c
00bbfbfc	mov x0,x20
00bbfc00	ldp x20,x19,[sp, #0x30]
00bbfc04	ldp x22,x21,[sp, #0x20]
00bbfc08	ldp x24,x23,[sp, #0x10]
00bbfc0c	ldp x29,x30,[sp], #0x40
00bbfc10	ret
00bbfc14	mov x20,x9
00bbfc18	sub x21,x8,x5
00bbfc1c	ldr x9,[x2, #0x8]
00bbfc20	add x8,x7,x21
00bbfc24	add x10,x8,x9
00bbfc28	cmp x10,x7
00bbfc2c	b.ls 0x00bbfc6c
00bbfc30	neg x9,x21
00bbfc34	mov x22,x1
00bbfc38	mov x1,x8
00bbfc3c	mov x24,x2
00bbfc40	mov x2,x9
00bbfc44	mov x19,x0
00bbfc48	mov x23,x5
00bbfc4c	bl 0x00c2ff60
00bbfc50	ldr x8,[x24, #0x8]
00bbfc54	mov x1,x22
00bbfc58	mov x2,x23
00bbfc5c	sub x0,x19,x21
00bbfc60	add x3,x8,x21
00bbfc64	str x3,[x24, #0x8]
00bbfc68	b 0x00bbfbf4
00bbfc6c	mov x1,x8
00bbfc70	mov x2,x9
00bbfc74	bl 0x00c2ff60
00bbfc78	b 0x00bbfbfc
