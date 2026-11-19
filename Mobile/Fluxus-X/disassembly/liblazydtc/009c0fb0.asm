; tls_valid_group @ 009c0fb0
009c0fb0	ldr x8,[x0, #0x9a8]
009c0fb4	ldr x9,[x8, #0x630]
009c0fb8	cbz x9,0x009c0fe0
009c0fbc	ldr x8,[x8, #0x628]
009c0fc0	mov x10,xzr
009c0fc4	ldrh w11,[x8, #0x1c]
009c0fc8	cmp w11,w1, UXTH 
009c0fcc	b.eq 0x009c0fe4
009c0fd0	add x10,x10,#0x1
009c0fd4	cmp x10,x9
009c0fd8	add x8,x8,#0x38
009c0fdc	b.cc 0x009c0fc4
009c0fe0	mov x8,xzr
009c0fe4	cbz x5,0x009c0fec
009c0fe8	str wzr,[x5]
009c0fec	stp x20,x19,[sp, #-0x20]!
009c0ff0	stp x29,x30,[sp, #0x10]
009c0ff4	add x29,sp,#0x10
009c0ff8	cbz x8,0x009c111c
009c0ffc	ldr x9,[x0, #0x8]
009c1000	ldr x9,[x9, #0xc0]
009c1004	ldrb w9,[x9, #0x60]
009c1008	tbnz w9,#0x3,0x009c1078
009c100c	ldr w10,[x8, #0x20]
009c1010	tbnz w10,#0x1f,0x009c111c
009c1014	ldr w9,[x8, #0x24]
009c1018	tbnz w9,#0x1f,0x009c111c
009c101c	cmp w9,#0x0
009c1020	cset w11,eq
009c1024	cmp w9,w2
009c1028	cset w12,ge
009c102c	cmp w10,#0x1
009c1030	orr w11,w11,w12
009c1034	cset w12,lt
009c1038	cmp w10,w3
009c103c	cset w10,le
009c1040	orr w10,w10,w12
009c1044	cmp w3,#0x304
009c1048	and w20,w10,w11
009c104c	b.ne 0x009c10d0
009c1050	cbz x5,0x009c10d0
009c1054	cbz w20,0x009c10d0
009c1058	cmp w9,#0x0
009c105c	cset w10,eq
009c1060	cmp w9,#0x303
009c1064	cset w9,gt
009c1068	orr w9,w10,w9
009c106c	str w9,[x5]
009c1070	cbnz w4,0x009c10d4
009c1074	b 0x009c1124
009c1078	ldr w9,[x8, #0x28]
009c107c	tbnz w9,#0x1f,0x009c111c
009c1080	ldr w10,[x8, #0x2c]
009c1084	tbnz w10,#0x1f,0x009c111c
009c1088	cbz w10,0x009c1138
009c108c	cmp w2,#0x100
009c1090	orr w11,wzr,#0xff00
009c1094	csel w12,w11,w2,eq
009c1098	cmp w10,#0x100
009c109c	csel w10,w11,w10,eq
009c10a0	cmp w12,w10
009c10a4	cset w20,ge
009c10a8	cmp w9,#0x1
009c10ac	b.lt 0x009c10d0
009c10b0	cmp w3,#0x100
009c10b4	orr w10,wzr,#0xff00
009c10b8	csel w11,w10,w3,eq
009c10bc	cmp w9,#0x100
009c10c0	csel w9,w10,w9,eq
009c10c4	cmp w11,w9
009c10c8	cset w9,le
009c10cc	and w20,w20,w9
009c10d0	cbz w4,0x009c1124
009c10d4	ldr x19,[x8, #0x10]
009c10d8	adrp x1,0x2cf000
009c10dc	add x1,x1,#0x33a
009c10e0	mov x0,x19
009c10e4	bl 0x00c301f0
009c10e8	cbz w0,0x009c1124
009c10ec	adrp x1,0x2b7000
009c10f0	add x1,x1,#0x7b3
009c10f4	mov x0,x19
009c10f8	bl 0x00c301f0
009c10fc	cbz w0,0x009c1124
009c1100	adrp x1,0x29f000
009c1104	add x1,x1,#0xe3c
009c1108	mov x0,x19
009c110c	bl 0x00c301f0
009c1110	cmp w0,#0x0
009c1114	cset w8,eq
009c1118	b 0x009c1128
009c111c	mov w0,wzr
009c1120	b 0x009c112c
009c1124	mov w8,#0x1
009c1128	and w0,w8,w20
009c112c	ldp x29,x30,[sp, #0x10]
009c1130	ldp x20,x19,[sp], #0x20
009c1134	ret
009c1138	mov w20,#0x1
009c113c	cmp w9,#0x1
009c1140	b.ge 0x009c10b0
009c1144	b 0x009c10d0
