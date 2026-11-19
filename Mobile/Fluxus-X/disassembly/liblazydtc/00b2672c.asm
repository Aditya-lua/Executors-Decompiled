; ossl_siv128_decrypt @ 00b2672c
00b2672c	sub sp,sp,#0x60
00b26730	stp x22,x21,[sp, #0x30]
00b26734	stp x20,x19,[sp, #0x40]
00b26738	stp x29,x30,[sp, #0x50]
00b2673c	ldr w8,[x0, #0x3c]
00b26740	str x23,[sp, #0x20]
00b26744	add x29,sp,#0x50
00b26748	cbz w8,0x00b2680c
00b2674c	ldr q0,[x0, #0x10]
00b26750	sub w8,w8,#0x1
00b26754	str w8,[x0, #0x3c]
00b26758	mov x19,x3
00b2675c	str q0,[sp]
00b26760	ldrb w8,[sp, #0x8]
00b26764	mov x20,x2
00b26768	mov x21,x0
00b2676c	mov x22,x1
00b26770	and w8,w8,#0x7f
00b26774	strb w8,[sp, #0x8]
00b26778	ldrb w8,[sp, #0xc]
00b2677c	mov x4,sp
00b26780	mov w5,#0x1
00b26784	mov x1,xzr
00b26788	and w8,w8,#0x7f
00b2678c	strb w8,[sp, #0xc]
00b26790	ldr x23,[x0, #0x20]
00b26794	mov x2,xzr
00b26798	mov x3,xzr
00b2679c	str w19,[sp, #0x10]
00b267a0	mov x0,x23
00b267a4	bl 0x00c34be0
00b267a8	cbz w0,0x00b2680c
00b267ac	add x2,sp,#0x10
00b267b0	mov x0,x23
00b267b4	mov x1,x20
00b267b8	mov x3,x22
00b267bc	mov w4,w19
00b267c0	bl 0x00c37310
00b267c4	cbz w0,0x00b2680c
00b267c8	add x1,sp,#0x10
00b267cc	mov x0,x21
00b267d0	mov x2,x20
00b267d4	mov x3,x19
00b267d8	bl 0x00b2650c
00b267dc	cbz w0,0x00b2680c
00b267e0	add x8,x21,#0x10
00b267e4	ldr q0,[sp, #0x10]
00b267e8	ldr q1,[x8]
00b267ec	eor v0.16B,v0.16B,v1.16B
00b267f0	str q0,[sp, #0x10]
00b267f4	ldp x8,x9,[sp, #0x10]
00b267f8	orr x8,x9,x8
00b267fc	cbz x8,0x00b2682c
00b26800	mov x0,x20
00b26804	mov x1,x19
00b26808	bl 0x00c34750
00b2680c	mov w19,wzr
00b26810	mov w0,w19
00b26814	ldp x29,x30,[sp, #0x50]
00b26818	ldp x20,x19,[sp, #0x40]
00b2681c	ldp x22,x21,[sp, #0x30]
00b26820	ldr x23,[sp, #0x20]
00b26824	add sp,sp,#0x60
00b26828	ret
00b2682c	str wzr,[x21, #0x38]
00b26830	b 0x00b26810
