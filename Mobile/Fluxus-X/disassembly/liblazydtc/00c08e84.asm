; std::__ndk1::moneypunct_byname<char,true>::init @ 00c08e84
00c08e84	paciasp
00c08e88	sub sp,sp,#0x90
00c08e8c	stp x29,x30,[sp, #0x50]
00c08e90	stp x24,x23,[sp, #0x60]
00c08e94	stp x22,x21,[sp, #0x70]
00c08e98	stp x20,x19,[sp, #0x80]
00c08e9c	add x29,sp,#0x50
00c08ea0	mov x20,x0
00c08ea4	mov w0,#0x1fbf
00c08ea8	mov x2,xzr
00c08eac	mov x21,x1
00c08eb0	bl 0x00c43890
00c08eb4	stur x0,[x29, #-0x10]
00c08eb8	cbz x0,0x00c091a4
00c08ebc	mov x19,x0
00c08ec0	bl 0x00c43880
00c08ec4	mov x22,x0
00c08ec8	str x0,[sp, #0x20]
00c08ecc	bl 0x00c43bb0
00c08ed0	mov x21,x0
00c08ed4	cbz x22,0x00c08ee0
00c08ed8	mov x0,x22
00c08edc	bl 0x00c43880
00c08ee0	ldr x23,[x21, #0x28]
00c08ee4	ldrb w22,[x23]
00c08ee8	cbz w22,0x00c08f8c
00c08eec	ldrb w8,[x23, #0x1]
00c08ef0	cbz w8,0x00c08f90
00c08ef4	mov x0,x23
00c08ef8	str xzr,[sp, #0x8]
00c08efc	bl 0x00c2ff50
00c08f00	mov x24,x0
00c08f04	mov x0,x19
00c08f08	bl 0x00c43880
00c08f0c	mov x22,x0
00c08f10	str x0,[sp, #0x20]
00c08f14	sub x0,x29,#0x4
00c08f18	add x3,sp,#0x8
00c08f1c	mov x1,x23
00c08f20	mov x2,x24
00c08f24	bl 0x00c43b00
00c08f28	mov x23,x0
00c08f2c	cbz x22,0x00c08f38
00c08f30	mov x0,x22
00c08f34	bl 0x00c43880
00c08f38	cmn x23,#0x2
00c08f3c	b.cs 0x00c08f8c
00c08f40	ldur w23,[x29, #-0x4]
00c08f44	mov x0,x19
00c08f48	bl 0x00c43880
00c08f4c	mov x24,x0
00c08f50	str x0,[sp, #0x20]
00c08f54	mov w0,w23
00c08f58	bl 0x00c43990
00c08f5c	mov w22,w0
00c08f60	cbz x24,0x00c08f6c
00c08f64	mov x0,x24
00c08f68	bl 0x00c43880
00c08f6c	cmn w22,#0x1
00c08f70	b.ne 0x00c08f90
00c08f74	cmp w23,#0xa0
00c08f78	mov w8,#0x202f
00c08f7c	ccmp w23,w8,#0x4,ne
00c08f80	mov w8,#0x20
00c08f84	csinv w22,w8,wzr,eq
00c08f88	b 0x00c08f90
00c08f8c	mov w22,#0xff
00c08f90	strb w22,[x20, #0x10]
00c08f94	ldr x23,[x21, #0x30]
00c08f98	ldrb w22,[x23]
00c08f9c	cbz w22,0x00c09040
00c08fa0	ldrb w8,[x23, #0x1]
00c08fa4	cbz w8,0x00c09044
00c08fa8	mov x0,x23
00c08fac	str xzr,[sp, #0x8]
00c08fb0	bl 0x00c2ff50
00c08fb4	mov x24,x0
00c08fb8	mov x0,x19
00c08fbc	bl 0x00c43880
00c08fc0	mov x22,x0
00c08fc4	str x0,[sp, #0x20]
00c08fc8	sub x0,x29,#0x4
00c08fcc	add x3,sp,#0x8
00c08fd0	mov x1,x23
00c08fd4	mov x2,x24
00c08fd8	bl 0x00c43b00
00c08fdc	mov x23,x0
00c08fe0	cbz x22,0x00c08fec
00c08fe4	mov x0,x22
00c08fe8	bl 0x00c43880
00c08fec	cmn x23,#0x2
00c08ff0	b.cs 0x00c09040
00c08ff4	ldur w23,[x29, #-0x4]
00c08ff8	mov x0,x19
00c08ffc	bl 0x00c43880
00c09000	mov x24,x0
00c09004	str x0,[sp, #0x20]
00c09008	mov w0,w23
00c0900c	bl 0x00c43990
00c09010	mov w22,w0
00c09014	cbz x24,0x00c09020
00c09018	mov x0,x24
00c0901c	bl 0x00c43880
00c09020	cmn w22,#0x1
00c09024	b.ne 0x00c09044
00c09028	cmp w23,#0xa0
00c0902c	mov w8,#0x202f
00c09030	ccmp w23,w8,#0x4,ne
00c09034	mov w8,#0x20
00c09038	csinv w22,w8,wzr,eq
00c0903c	b 0x00c09044
00c09040	mov w22,#0xff
00c09044	strb w22,[x20, #0x11]
00c09048	ldr x1,[x21, #0x38]
00c0904c	add x0,x20,#0x18
00c09050	bl 0x0080269c
00c09054	ldr x1,[x21, #0x18]
00c09058	add x0,x20,#0x30
00c0905c	bl 0x0080269c
00c09060	ldrb w8,[x21, #0x50]
00c09064	cmp w8,#0xff
00c09068	csel w8,wzr,w8,eq
00c0906c	str w8,[x20, #0x78]
00c09070	ldrb w8,[x21, #0x5c]
00c09074	cbz w8,0x00c090b4
00c09078	ldr x1,[x21, #0x40]
00c0907c	add x0,x20,#0x48
00c09080	bl 0x0080269c
00c09084	ldrb w8,[x21, #0x5d]
00c09088	cbz w8,0x00c090ec
00c0908c	ldr x1,[x21, #0x48]
00c09090	add x0,x20,#0x60
00c09094	bl 0x0080269c
00c09098	ldurb w8,[x20, #0x30]
00c0909c	tbnz w8,#0x0,0x00c09124
00c090a0	ldur q0,[x20, #0x30]
00c090a4	ldur x8,[x20, #0x40]
00c090a8	str q0,[sp, #0x20]
00c090ac	str x8,[sp, #0x30]
00c090b0	b 0x00c09130
00c090b4	ldurb w8,[x20, #0x48]
00c090b8	tbnz w8,#0x0,0x00c090cc
00c090bc	mov w8,#0x4
00c090c0	strb w8,[x20, #0x48]
00c090c4	add x8,x20,#0x49
00c090c8	b 0x00c090d8
00c090cc	mov w9,#0x2
00c090d0	ldr x8,[x20, #0x58]
00c090d4	str x9,[x20, #0x50]
00c090d8	mov w9,#0x2928
00c090dc	strb wzr,[x8, #0x2]
00c090e0	strh w9,[x8]
00c090e4	ldrb w8,[x21, #0x5d]
00c090e8	cbnz w8,0x00c0908c
00c090ec	ldurb w8,[x20, #0x60]
00c090f0	tbnz w8,#0x0,0x00c09104
00c090f4	mov w8,#0x4
00c090f8	strb w8,[x20, #0x60]
00c090fc	add x8,x20,#0x61
00c09100	b 0x00c09110
00c09104	mov w9,#0x2
00c09108	ldr x8,[x20, #0x70]
00c0910c	str x9,[x20, #0x68]
00c09110	mov w9,#0x2928
00c09114	strb wzr,[x8, #0x2]
00c09118	strh w9,[x8]
00c0911c	ldurb w8,[x20, #0x30]
00c09120	tbz w8,#0x0,0x00c090a0
00c09124	ldp x2,x1,[x20, #0x38]
00c09128	add x0,sp,#0x20
00c0912c	bl 0x007ff40c
00c09130	ldrb w5,[x21, #0x5c]
00c09134	ldrb w4,[x21, #0x59]
00c09138	ldrb w3,[x21, #0x58]
00c0913c	add x0,x20,#0x7c
00c09140	add x1,sp,#0x20
00c09144	mov w2,#0x1
00c09148	bl 0x00c08a4c
00c0914c	ldrb w5,[x21, #0x5d]
00c09150	ldrb w4,[x21, #0x5b]
00c09154	ldrb w3,[x21, #0x5a]
00c09158	add x0,x20,#0x80
00c0915c	add x1,x20,#0x30
00c09160	mov w2,#0x1
00c09164	bl 0x00c08a4c
00c09168	ldrb w8,[sp, #0x20]
00c0916c	tbz w8,#0x0,0x00c09180
00c09170	ldr x8,[sp, #0x20]
00c09174	ldr x0,[sp, #0x30]
00c09178	and x1,x8,#-0x2
00c0917c	bl 0x00c2fe80
00c09180	mov x0,x19
00c09184	bl 0x00c43980
00c09188	ldp x20,x19,[sp, #0x80]
00c0918c	ldp x22,x21,[sp, #0x70]
00c09190	ldp x24,x23,[sp, #0x60]
00c09194	ldp x29,x30,[sp, #0x50]
00c09198	add sp,sp,#0x90
00c0919c	autiasp
00c091a0	ret
00c091a4	add x0,sp,#0x8
00c091a8	mov x1,x21
00c091ac	bl 0x00852d7c
00c091b0	adrp x0,0x2be000
00c091b4	add x0,x0,#0xc9d
00c091b8	add x8,sp,#0x20
00c091bc	add x1,sp,#0x8
00c091c0	add x19,sp,#0x20
00c091c4	bl 0x00bfb964
00c091c8	ldrb w8,[sp, #0x20]
00c091cc	ldr x9,[sp, #0x30]
00c091d0	tst w8,#0x1
00c091d4	csinc x0,x9,x19,ne
00c091d8	bl 0x00c43d00
00c091dc	bl 0x007fe114
