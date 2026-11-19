; std::__ndk1::__money_get<wchar_t>::__gather_info @ 00bf0f84
00bf0f84	paciasp
00bf0f88	sub sp,sp,#0x80
00bf0f8c	stp x29,x30,[sp, #0x20]
00bf0f90	str x27,[sp, #0x30]
00bf0f94	stp x26,x25,[sp, #0x40]
00bf0f98	stp x24,x23,[sp, #0x50]
00bf0f9c	stp x22,x21,[sp, #0x60]
00bf0fa0	stp x20,x19,[sp, #0x70]
00bf0fa4	add x29,sp,#0x20
00bf0fa8	ldr x26,[x29, #0x60]
00bf0fac	ldr x21,[x1]
00bf0fb0	mov x24,x7
00bf0fb4	mov x19,x6
00bf0fb8	mov x20,x5
00bf0fbc	mov x22,x4
00bf0fc0	mov x23,x3
00bf0fc4	mov x25,x2
00bf0fc8	tbz w0,#0x0,0x00bf1000
00bf0fcc	adrp x27,0xcb5000
00bf0fd0	ldr x27,[x27, #0xc30]
00bf0fd4	stur x27,[x29, #-0x8]
00bf0fd8	ldar x8,[x27]
00bf0fdc	cmn x8,#0x1
00bf0fe0	b.eq 0x00bf1040
00bf0fe4	sub x8,x29,#0x8
00bf0fe8	mov x9,sp
00bf0fec	adrp x0,0xcb5000
00bf0ff0	str x8,[sp]
00bf0ff4	str x9,[x29, #0x18]
00bf0ff8	ldr x0,[x0, #0xc30]
00bf0ffc	b 0x00bf1030
00bf1000	adrp x27,0xcb5000
00bf1004	ldr x27,[x27, #0xc38]
00bf1008	stur x27,[x29, #-0x8]
00bf100c	ldar x8,[x27]
00bf1010	cmn x8,#0x1
00bf1014	b.eq 0x00bf1040
00bf1018	sub x8,x29,#0x8
00bf101c	mov x9,sp
00bf1020	adrp x0,0xcb5000
00bf1024	str x8,[sp]
00bf1028	str x9,[x29, #0x18]
00bf102c	ldr x0,[x0, #0xc38]
00bf1030	nop
00bf1034	adr x2,0xc0bab0
00bf1038	add x1,x29,#0x18
00bf103c	bl 0x00c305d0
00bf1040	ldp x8,x10,[x21, #0x10]
00bf1044	ldrsw x9,[x27, #0x8]
00bf1048	sub x9,x9,#0x1
00bf104c	sub x10,x10,x8
00bf1050	cmp x9,x10, ASR #0x3
00bf1054	b.cs 0x00bf11d4
00bf1058	ldr x21,[x8, x9, LSL #0x3]
00bf105c	cbz x21,0x00bf11d4
00bf1060	ldr x8,[x21]
00bf1064	mov x0,x21
00bf1068	ldr x8,[x8, #0x58]
00bf106c	blr x8
00bf1070	str w0,[x25]
00bf1074	mov x0,x21
00bf1078	ldr x8,[x21]
00bf107c	ldr x9,[x8, #0x40]
00bf1080	mov x8,sp
00bf1084	blr x9
00bf1088	ldrb w8,[x26]
00bf108c	tbz w8,#0x0,0x00bf10a4
00bf1090	ldr x8,[x26]
00bf1094	ldr x0,[x26, #0x10]
00bf1098	lsl x8,x8,#0x2
00bf109c	and x1,x8,#-0x8
00bf10a0	bl 0x00c2fe80
00bf10a4	ldr q0,[sp]
00bf10a8	ldr x8,[sp, #0x10]
00bf10ac	mov x0,x21
00bf10b0	str q0,[x26]
00bf10b4	str x8,[x26, #0x10]
00bf10b8	ldr x8,[x21]
00bf10bc	ldr x9,[x8, #0x38]
00bf10c0	mov x8,sp
00bf10c4	blr x9
00bf10c8	ldrb w8,[x24]
00bf10cc	tbz w8,#0x0,0x00bf10e4
00bf10d0	ldr x8,[x24]
00bf10d4	ldr x0,[x24, #0x10]
00bf10d8	lsl x8,x8,#0x2
00bf10dc	and x1,x8,#-0x8
00bf10e0	bl 0x00c2fe80
00bf10e4	ldr q0,[sp]
00bf10e8	ldr x8,[sp, #0x10]
00bf10ec	mov x0,x21
00bf10f0	str q0,[x24]
00bf10f4	str x8,[x24, #0x10]
00bf10f8	ldr x8,[x21]
00bf10fc	ldr x8,[x8, #0x18]
00bf1100	blr x8
00bf1104	str w0,[x23]
00bf1108	mov x0,x21
00bf110c	ldr x8,[x21]
00bf1110	ldr x8,[x8, #0x20]
00bf1114	blr x8
00bf1118	str w0,[x22]
00bf111c	mov x0,x21
00bf1120	ldr x8,[x21]
00bf1124	ldr x9,[x8, #0x28]
00bf1128	mov x8,sp
00bf112c	blr x9
00bf1130	ldrb w8,[x20]
00bf1134	tbz w8,#0x0,0x00bf1148
00bf1138	ldr x8,[x20]
00bf113c	ldr x0,[x20, #0x10]
00bf1140	and x1,x8,#-0x2
00bf1144	bl 0x00c2fe80
00bf1148	ldr q0,[sp]
00bf114c	ldr x8,[sp, #0x10]
00bf1150	mov x0,x21
00bf1154	str q0,[x20]
00bf1158	str x8,[x20, #0x10]
00bf115c	ldr x8,[x21]
00bf1160	ldr x9,[x8, #0x30]
00bf1164	mov x8,sp
00bf1168	blr x9
00bf116c	ldrb w8,[x19]
00bf1170	tbz w8,#0x0,0x00bf1188
00bf1174	ldr x8,[x19]
00bf1178	ldr x0,[x19, #0x10]
00bf117c	lsl x8,x8,#0x2
00bf1180	and x1,x8,#-0x8
00bf1184	bl 0x00c2fe80
00bf1188	ldr q0,[sp]
00bf118c	ldr x8,[sp, #0x10]
00bf1190	mov x0,x21
00bf1194	str q0,[x19]
00bf1198	str x8,[x19, #0x10]
00bf119c	ldr x19,[x29, #0x68]
00bf11a0	ldr x8,[x21]
00bf11a4	ldr x8,[x8, #0x48]
00bf11a8	blr x8
00bf11ac	str w0,[x19]
00bf11b0	ldp x20,x19,[sp, #0x70]
00bf11b4	ldr x27,[sp, #0x30]
00bf11b8	ldp x22,x21,[sp, #0x60]
00bf11bc	ldp x24,x23,[sp, #0x50]
00bf11c0	ldp x26,x25,[sp, #0x40]
00bf11c4	ldp x29,x30,[sp, #0x20]
00bf11c8	add sp,sp,#0x80
00bf11cc	autiasp
00bf11d0	ret
00bf11d4	bl 0x00bd8968
