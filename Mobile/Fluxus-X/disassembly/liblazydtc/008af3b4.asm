; FUN_008af3b4 @ 008af3b4
008af3b4	adrp x8,0xcb4000
008af3b8	adrp x9,0xcb4000
008af3bc	mov x4,x2
008af3c0	ldr x8,[x8, #0xbb0]
008af3c4	ldrb w10,[x8]
008af3c8	ldr x9,[x9, #0xbb8]
008af3cc	ldr x8,[x0, #0x60]
008af3d0	ldrb w9,[x9]
008af3d4	cmp w10,#0x1
008af3d8	b.ne 0x008af404
008af3dc	cbz w9,0x008af42c
008af3e0	ldr x8,[x8, #0x4b0]
008af3e4	cbz x8,0x008af42c
008af3e8	ldr w8,[x1, #0x4]
008af3ec	ldrb w3,[x1, #0x1]
008af3f0	add x9,x8,#0x8
008af3f4	cmp w8,#0x8
008af3f8	mov w8,#0x10
008af3fc	csel x2,x8,x9,cc
008af400	b 0x008b833c
008af404	cbz w9,0x008af448
008af408	ldr x8,[x8, #0x4b0]
008af40c	cbz x8,0x008af448
008af410	ldr w8,[x1, #0x4]
008af414	ldrb w3,[x1, #0x1]
008af418	add x9,x8,#0x8
008af41c	cmp w8,#0x8
008af420	mov w8,#0x10
008af424	csel x2,x8,x9,cc
008af428	b 0x008b7ed0
008af42c	ldr w8,[x1, #0x4]
008af430	ldrb w3,[x1, #0x1]
008af434	add x9,x8,#0x8
008af438	cmp w8,#0x8
008af43c	mov w8,#0x10
008af440	csel x2,x8,x9,cc
008af444	b 0x008b816c
008af448	ldr w8,[x1, #0x4]
008af44c	ldrb w3,[x1, #0x1]
008af450	add x9,x8,#0x8
008af454	cmp w8,#0x8
008af458	mov w8,#0x10
008af45c	csel x2,x8,x9,cc
008af460	b 0x008b7bd4
