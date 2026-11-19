; PKCS7_set_attributes @ 00ac131c
00ac131c	stp x22,x21,[sp, #-0x30]!
00ac1320	stp x20,x19,[sp, #0x10]
00ac1324	stp x29,x30,[sp, #0x20]
00ac1328	mov x20,x1
00ac132c	adrp x1,0xcb5000
00ac1330	mov x19,x0
00ac1334	ldr x0,[x0, #0x30]
00ac1338	ldr x1,[x1, #0x640]
00ac133c	add x29,sp,#0x20
00ac1340	bl 0x00c32600
00ac1344	mov x0,x20
00ac1348	bl 0x00c35330
00ac134c	str x0,[x19, #0x30]
00ac1350	cbz x0,0x00ac13a8
00ac1354	mov x0,x20
00ac1358	bl 0x00c325e0
00ac135c	cmp w0,#0x1
00ac1360	b.lt 0x00ac13a4
00ac1364	mov w21,wzr
00ac1368	ldr x22,[x19, #0x30]
00ac136c	mov x0,x20
00ac1370	mov w1,w21
00ac1374	bl 0x00c32610
00ac1378	bl 0x00c3f7a0
00ac137c	mov x2,x0
00ac1380	mov x0,x22
00ac1384	mov w1,w21
00ac1388	bl 0x00c38080
00ac138c	cbz x0,0x00ac13a8
00ac1390	mov x0,x20
00ac1394	add w21,w21,#0x1
00ac1398	bl 0x00c325e0
00ac139c	cmp w21,w0
00ac13a0	b.lt 0x00ac1368
00ac13a4	mov w0,#0x1
00ac13a8	ldp x29,x30,[sp, #0x20]
00ac13ac	ldp x20,x19,[sp, #0x10]
00ac13b0	ldp x22,x21,[sp], #0x30
00ac13b4	ret
