; ossl_dh_key_todata @ 00a196c4
00a196c4	sub sp,sp,#0x40
00a196c8	stp x21,xzr,[sp, #0x10]
00a196cc	stp x20,x19,[sp, #0x20]
00a196d0	stp x29,x30,[sp, #0x30]
00a196d4	add x29,sp,#0x30
00a196d8	str xzr,[sp, #0x8]
00a196dc	cbz x0,0x00a19740
00a196e0	mov x19,x2
00a196e4	mov x20,x1
00a196e8	add x1,sp,#0x8
00a196ec	add x2,sp,#0x18
00a196f0	mov w21,w3
00a196f4	bl 0x00c39d20
00a196f8	cbz w21,0x00a1971c
00a196fc	ldr x3,[sp, #0x18]
00a19700	cbz x3,0x00a1971c
00a19704	adrp x2,0x2a3000
00a19708	add x2,x2,#0xe83
00a1970c	mov x0,x20
00a19710	mov x1,x19
00a19714	bl 0x00c39de0
00a19718	cbz w0,0x00a19740
00a1971c	ldr x3,[sp, #0x8]
00a19720	cbz x3,0x00a1973c
00a19724	adrp x2,0x2ad000
00a19728	add x2,x2,#0x463
00a1972c	mov x0,x20
00a19730	mov x1,x19
00a19734	bl 0x00c39de0
00a19738	cbz w0,0x00a19740
00a1973c	mov w0,#0x1
00a19740	ldp x29,x30,[sp, #0x30]
00a19744	ldp x20,x19,[sp, #0x20]
00a19748	ldr x21,[sp, #0x10]
00a1974c	add sp,sp,#0x40
00a19750	ret
