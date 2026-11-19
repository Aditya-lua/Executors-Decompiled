; FUN_0083b624 @ 0083b624
0083b624	sub sp,sp,#0x60
0083b628	stp x29,x30,[sp, #0x10]
0083b62c	str x25,[sp, #0x20]
0083b630	stp x24,x23,[sp, #0x30]
0083b634	stp x22,x21,[sp, #0x40]
0083b638	stp x20,x19,[sp, #0x50]
0083b63c	add x29,sp,#0x10
0083b640	mrs x25,tpidr_el0
0083b644	mov x19,x3
0083b648	mov x22,x2
0083b64c	ldr x8,[x25, #0x28]
0083b650	mov x21,x1
0083b654	mov x20,x0
0083b658	str x8,[sp, #0x8]
0083b65c	ldrb w8,[x2, #0xc]
0083b660	cmp w8,#0x1
0083b664	b.ne 0x0083b69c
0083b668	ldr s0,[x22, #0x8]
0083b66c	adrp x8,0x29b000
0083b670	strb wzr,[x22, #0xc]
0083b674	ldr d1,[x8, #0x38]
0083b678	adrp x8,0x29b000
0083b67c	uxtl v0.8H,v0.8B
0083b680	ldr d2,[x8, #0x950]
0083b684	eor v0.8B,v0.8B,v1.8B
0083b688	ldr d1,[x22]
0083b68c	eor v1.8B,v1.8B,v2.8B
0083b690	uzp1 v0.8B,v0.8B,v0.8B
0083b694	str d1,[x22]
0083b698	str s0,[x22, #0x8]
0083b69c	mov x0,x19
0083b6a0	bl 0x0083f6a0
0083b6a4	mov x0,x20
0083b6a8	mov x1,x21
0083b6ac	mov x2,x22
0083b6b0	mov w3,wzr
0083b6b4	mov x4,xzr
0083b6b8	bl 0x008ac76c
0083b6bc	mov x0,x20
0083b6c0	mov w1,#0xffffffff
0083b6c4	bl 0x008aa2e4
0083b6c8	ldr x8,[x0]
0083b6cc	adrp x23,0xd1e000
0083b6d0	add x23,x23,#0x30
0083b6d4	mov x1,sp
0083b6d8	mov x2,sp
0083b6dc	mov x0,x23
0083b6e0	str x8,[sp]
0083b6e4	bl 0x00807f14
0083b6e8	adrp x24,0xcca000
0083b6ec	add x24,x24,#0x848
0083b6f0	mov x1,sp
0083b6f4	mov x2,sp
0083b6f8	mov x0,x24
0083b6fc	str x21,[sp]
0083b700	bl 0x0080837c
0083b704	mov x0,x20
0083b708	mov w1,#0xffffd8ee
0083b70c	mov x2,x22
0083b710	bl 0x008ad800
0083b714	mov x0,x20
0083b718	mov x1,x21
0083b71c	mov x2,x19
0083b720	mov w3,wzr
0083b724	mov x4,xzr
0083b728	bl 0x008ac76c
0083b72c	mov x0,x20
0083b730	mov w1,#0xffffffff
0083b734	bl 0x008aa2e4
0083b738	ldr x8,[x0]
0083b73c	mov x1,sp
0083b740	mov x2,sp
0083b744	mov x0,x23
0083b748	str x8,[sp]
0083b74c	bl 0x00807f14
0083b750	mov x1,sp
0083b754	mov x2,sp
0083b758	mov x0,x24
0083b75c	str x21,[sp]
0083b760	bl 0x0080837c
0083b764	mov x0,x20
0083b768	mov w1,#0xffffd8ee
0083b76c	mov x2,x19
0083b770	bl 0x008ad800
0083b774	ldr x8,[x25, #0x28]
0083b778	ldr x9,[sp, #0x8]
0083b77c	cmp x8,x9
0083b780	b.ne 0x0083b7a0
0083b784	ldp x20,x19,[sp, #0x50]
0083b788	ldr x25,[sp, #0x20]
0083b78c	ldp x22,x21,[sp, #0x40]
0083b790	ldp x24,x23,[sp, #0x30]
0083b794	ldp x29,x30,[sp, #0x10]
0083b798	add sp,sp,#0x60
0083b79c	ret
0083b7a0	bl 0x00c2fec0
