; mbedtls_rsa_export_raw @ 00ba6678
00ba6678	sub sp,sp,#0x70
00ba667c	stp x28,x27,[sp, #0x10]
00ba6680	stp x26,x25,[sp, #0x20]
00ba6684	stp x24,x23,[sp, #0x30]
00ba6688	stp x22,x21,[sp, #0x40]
00ba668c	stp x20,x19,[sp, #0x50]
00ba6690	stp x29,x30,[sp, #0x60]
00ba6694	add x29,sp,#0x60
00ba6698	ldr x8,[x29, #0x20]
00ba669c	add x20,x0,#0x10
00ba66a0	mov x19,x1
00ba66a4	mov x21,x0
00ba66a8	str x8,[sp]
00ba66ac	ldr x8,[x29, #0x18]
00ba66b0	mov x0,x20
00ba66b4	mov x1,xzr
00ba66b8	mov x22,x7
00ba66bc	str x8,[sp, #0x8]
00ba66c0	ldr x23,[x29, #0x10]
00ba66c4	mov x24,x6
00ba66c8	mov x25,x5
00ba66cc	mov x26,x4
00ba66d0	mov x27,x3
00ba66d4	mov x28,x2
00ba66d8	bl 0x00c41b40
00ba66dc	cbz w0,0x00ba6720
00ba66e0	add x0,x21,#0x40
00ba66e4	mov x1,xzr
00ba66e8	bl 0x00c41b40
00ba66ec	cbz w0,0x00ba6720
00ba66f0	add x0,x21,#0x50
00ba66f4	mov x1,xzr
00ba66f8	bl 0x00c41b40
00ba66fc	cbz w0,0x00ba6720
00ba6700	add x0,x21,#0x30
00ba6704	mov x1,xzr
00ba6708	bl 0x00c41b40
00ba670c	cbz w0,0x00ba6720
00ba6710	add x0,x21,#0x20
00ba6714	mov x1,xzr
00ba6718	bl 0x00c41b40
00ba671c	cbnz w0,0x00ba6730
00ba6720	mov w0,#0xffffbf80
00ba6724	cbnz x27,0x00ba6778
00ba6728	cbnz x25,0x00ba6778
00ba672c	cbnz x22,0x00ba6778
00ba6730	cbz x19,0x00ba6748
00ba6734	mov x0,x20
00ba6738	mov x1,x19
00ba673c	mov x2,x28
00ba6740	bl 0x00c41d80
00ba6744	cbnz w0,0x00ba6778
00ba6748	cbz x27,0x00ba6760
00ba674c	add x0,x21,#0x40
00ba6750	mov x1,x27
00ba6754	mov x2,x26
00ba6758	bl 0x00c41d80
00ba675c	cbnz w0,0x00ba6778
00ba6760	cbz x25,0x00ba6798
00ba6764	add x0,x21,#0x50
00ba6768	mov x1,x25
00ba676c	mov x2,x24
00ba6770	bl 0x00c41d80
00ba6774	cbz w0,0x00ba6798
00ba6778	ldp x29,x30,[sp, #0x60]
00ba677c	ldp x20,x19,[sp, #0x50]
00ba6780	ldp x22,x21,[sp, #0x40]
00ba6784	ldp x24,x23,[sp, #0x30]
00ba6788	ldp x26,x25,[sp, #0x20]
00ba678c	ldp x28,x27,[sp, #0x10]
00ba6790	add sp,sp,#0x70
00ba6794	ret
00ba6798	cbz x22,0x00ba67bc
00ba679c	add x0,x21,#0x30
00ba67a0	mov x1,x22
00ba67a4	mov x2,x23
00ba67a8	bl 0x00c41d80
00ba67ac	ldr x8,[sp, #0x8]
00ba67b0	cbz x8,0x00ba6778
00ba67b4	cbz w0,0x00ba67c4
00ba67b8	b 0x00ba6778
00ba67bc	ldr x8,[sp, #0x8]
00ba67c0	cbz x8,0x00ba67ec
00ba67c4	add x0,x21,#0x20
00ba67c8	ldp x2,x1,[sp]
00ba67cc	ldp x29,x30,[sp, #0x60]
00ba67d0	ldp x20,x19,[sp, #0x50]
00ba67d4	ldp x22,x21,[sp, #0x40]
00ba67d8	ldp x24,x23,[sp, #0x30]
00ba67dc	ldp x26,x25,[sp, #0x20]
00ba67e0	ldp x28,x27,[sp, #0x10]
00ba67e4	add sp,sp,#0x70
00ba67e8	b 0x00c41d80
00ba67ec	mov w0,wzr
00ba67f0	b 0x00ba6778
