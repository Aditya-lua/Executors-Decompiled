; mbedtls_sha1_update @ 00bac3a8
00bac3a8	str x25,[sp, #-0x50]!
00bac3ac	stp x24,x23,[sp, #0x10]
00bac3b0	stp x22,x21,[sp, #0x20]
00bac3b4	stp x20,x19,[sp, #0x30]
00bac3b8	stp x29,x30,[sp, #0x40]
00bac3bc	add x29,sp,#0x40
00bac3c0	mov x19,x2
00bac3c4	mov x21,x1
00bac3c8	mov x20,x0
00bac3cc	cbz x2,0x00bac488
00bac3d0	ldr w8,[x20]
00bac3d4	and w24,w8,#0x3f
00bac3d8	adds w8,w8,w19
00bac3dc	str w8,[x20]
00bac3e0	b.cc 0x00bac3f0
00bac3e4	ldr w8,[x20, #0x4]
00bac3e8	add w8,w8,#0x1
00bac3ec	str w8,[x20, #0x4]
00bac3f0	cbz w24,0x00bac430
00bac3f4	mov w8,#0x40
00bac3f8	sub w22,w8,w24
00bac3fc	cmp x22,x19
00bac400	b.hi 0x00bac430
00bac404	add x23,x20,#0x1c
00bac408	add x0,x23,x24
00bac40c	mov x1,x21
00bac410	mov x2,x22
00bac414	bl 0x00c2ffd0
00bac418	mov x0,x20
00bac41c	mov x1,x23
00bac420	bl 0x00c434e0
00bac424	mov w24,wzr
00bac428	add x21,x21,x22
00bac42c	sub x19,x19,x22
00bac430	subs x23,x19,#0x40
00bac434	b.cc 0x00bac46c
00bac438	and x25,x23,#-0x40
00bac43c	add x8,x21,x25
00bac440	add x22,x8,#0x40
00bac444	mov x0,x20
00bac448	mov x1,x21
00bac44c	bl 0x00c434e0
00bac450	sub x19,x19,#0x40
00bac454	cmp x19,#0x3f
00bac458	add x21,x21,#0x40
00bac45c	b.hi 0x00bac444
00bac460	sub x19,x23,x25
00bac464	cbnz x19,0x00bac474
00bac468	b 0x00bac488
00bac46c	mov x22,x21
00bac470	cbz x19,0x00bac488
00bac474	add x8,x20,x24
00bac478	add x0,x8,#0x1c
00bac47c	mov x1,x22
00bac480	mov x2,x19
00bac484	bl 0x00c2ffd0
00bac488	ldp x29,x30,[sp, #0x40]
00bac48c	ldp x20,x19,[sp, #0x30]
00bac490	ldp x22,x21,[sp, #0x20]
00bac494	ldp x24,x23,[sp, #0x10]
00bac498	mov w0,wzr
00bac49c	ldr x25,[sp], #0x50
00bac4a0	ret
