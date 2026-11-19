; OCSP_accept_responses_new @ 00ab12fc
00ab12fc	stp x20,x19,[sp, #-0x20]!
00ab1300	stp x29,x30,[sp, #0x10]
00ab1304	add x29,sp,#0x10
00ab1308	mov x20,x0
00ab130c	bl 0x00c34780
00ab1310	mov x19,x0
00ab1314	cbz x0,0x00ab1364
00ab1318	cbz x20,0x00ab134c
00ab131c	ldr x0,[x20]
00ab1320	cbz x0,0x00ab134c
00ab1324	add x20,x20,#0x8
00ab1328	bl 0x00c364a0
00ab132c	cbz w0,0x00ab1344
00ab1330	bl 0x00c37740
00ab1334	cbz x0,0x00ab1344
00ab1338	mov x1,x0
00ab133c	mov x0,x19
00ab1340	bl 0x00c347a0
00ab1344	ldr x0,[x20], #0x8
00ab1348	cbnz x0,0x00ab1328
00ab134c	mov w0,#0x170
00ab1350	mov w1,wzr
00ab1354	mov x2,x19
00ab1358	bl 0x00c3ef90
00ab135c	mov x20,x0
00ab1360	b 0x00ab1368
00ab1364	mov x20,xzr
00ab1368	adrp x1,0xcb5000
00ab136c	ldr x1,[x1, #0x320]
00ab1370	mov x0,x19
00ab1374	bl 0x00c32600
00ab1378	ldp x29,x30,[sp, #0x10]
00ab137c	mov x0,x20
00ab1380	ldp x20,x19,[sp], #0x20
00ab1384	ret
