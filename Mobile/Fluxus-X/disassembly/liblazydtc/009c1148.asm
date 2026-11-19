; tls_group_allowed @ 009c1148
009c1148	ldr x8,[x0, #0x9a8]
009c114c	ldr x9,[x8, #0x630]
009c1150	cbz x9,0x009c117c
009c1154	ldr x8,[x8, #0x628]
009c1158	mov x10,xzr
009c115c	add x8,x8,#0x1c
009c1160	ldrh w11,[x8]
009c1164	cmp w11,w1, UXTH 
009c1168	b.eq 0x009c1184
009c116c	add x10,x10,#0x1
009c1170	cmp x10,x9
009c1174	add x8,x8,#0x38
009c1178	b.cc 0x009c1160
009c117c	mov w0,wzr
009c1180	ret
009c1184	cmp x8,#0x1c
009c1188	b.eq 0x009c11e4
009c118c	sub sp,sp,#0x20
009c1190	stp x29,x30,[sp, #0x10]
009c1194	add x29,sp,#0x10
009c1198	lsr w9,w1,#0x8
009c119c	sturb w9,[x29, #-0x4]
009c11a0	sturb w1,[x29, #-0x3]
009c11a4	ldur w8,[x8, #-0x4]
009c11a8	tst w1,#0xffff
009c11ac	b.eq 0x009c11dc
009c11b0	adrp x10,0x74c000
009c11b4	add x10,x10,#0xc34
009c11b8	mov x9,xzr
009c11bc	add x10,x10,#0x4
009c11c0	ldrh w11,[x10]
009c11c4	cmp w11,w1, UXTH 
009c11c8	b.eq 0x009c11ec
009c11cc	add x9,x9,#0x1
009c11d0	cmp x9,#0x2a
009c11d4	add x10,x10,#0x8
009c11d8	b.cc 0x009c11c0
009c11dc	mov w3,wzr
009c11e0	b 0x009c11f0
009c11e4	mov w0,wzr
009c11e8	ret
009c11ec	ldur w3,[x10, #-0x4]
009c11f0	sub x4,x29,#0x4
009c11f4	mov w1,w2
009c11f8	mov w2,w8
009c11fc	bl 0x00c34a30
009c1200	ldp x29,x30,[sp, #0x10]
009c1204	add sp,sp,#0x20
009c1208	ret
