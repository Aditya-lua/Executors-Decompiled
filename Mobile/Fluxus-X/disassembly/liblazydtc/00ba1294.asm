; mbedtls_ecjpake_derive_secret @ 00ba1294
00ba1294	sub sp,sp,#0xd0
00ba1298	str x25,[sp, #0x80]
00ba129c	stp x24,x23,[sp, #0x90]
00ba12a0	stp x22,x21,[sp, #0xa0]
00ba12a4	stp x20,x19,[sp, #0xb0]
00ba12a8	stp x29,x30,[sp, #0xc0]
00ba12ac	add x29,sp,#0xc0
00ba12b0	mrs x25,tpidr_el0
00ba12b4	ldr x8,[x25, #0x28]
00ba12b8	mov x20,x0
00ba12bc	mov x21,x5
00ba12c0	mov x22,x4
00ba12c4	stur x8,[x29, #-0x48]
00ba12c8	ldr w0,[x0]
00ba12cc	mov x23,x3
00ba12d0	mov x24,x2
00ba12d4	mov x19,x1
00ba12d8	bl 0x00c30210
00ba12dc	bl 0x00c302d0
00ba12e0	and x8,x0,#0xff
00ba12e4	cmp x8,x24
00ba12e8	str x8,[x23]
00ba12ec	b.ls 0x00ba12f8
00ba12f0	mov w21,#0xffffb100
00ba12f4	b 0x00ba1364
00ba12f8	mov x0,sp
00ba12fc	bl 0x00c42760
00ba1300	mov x1,sp
00ba1304	mov x0,x20
00ba1308	mov x2,x22
00ba130c	mov x3,x21
00ba1310	bl 0x00ba1398
00ba1314	mov w21,w0
00ba1318	cbnz w0,0x00ba135c
00ba131c	ldr x8,[x20, #0x80]
00ba1320	mov x0,sp
00ba1324	add x1,sp,#0x34
00ba1328	add x8,x8,#0x7
00ba132c	lsr x22,x8,#0x3
00ba1330	mov x2,x22
00ba1334	bl 0x00c41d80
00ba1338	mov w21,w0
00ba133c	cbnz w0,0x00ba135c
00ba1340	ldr w0,[x20]
00ba1344	bl 0x00c30210
00ba1348	add x1,sp,#0x34
00ba134c	mov x2,x22
00ba1350	mov x3,x19
00ba1354	bl 0x00c30220
00ba1358	mov w21,w0
00ba135c	mov x0,sp
00ba1360	bl 0x00c42750
00ba1364	ldr x8,[x25, #0x28]
00ba1368	ldur x9,[x29, #-0x48]
00ba136c	cmp x8,x9
00ba1370	b.ne 0x00ba1394
00ba1374	mov w0,w21
00ba1378	ldp x29,x30,[sp, #0xc0]
00ba137c	ldp x20,x19,[sp, #0xb0]
00ba1380	ldp x22,x21,[sp, #0xa0]
00ba1384	ldp x24,x23,[sp, #0x90]
00ba1388	ldr x25,[sp, #0x80]
00ba138c	add sp,sp,#0xd0
00ba1390	ret
00ba1394	bl 0x00c2fec0
