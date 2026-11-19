; mbedtls_mpi_read_file @ 00b7e730
00b7e730	stp x28,x23,[sp, #-0x40]!
00b7e734	stp x22,x21,[sp, #0x10]
00b7e738	stp x20,x19,[sp, #0x20]
00b7e73c	stp x29,x30,[sp, #0x30]
00b7e740	add x29,sp,#0x30
00b7e744	sub sp,sp,#0x9d0
00b7e748	mrs x22,tpidr_el0
00b7e74c	ldr x8,[x22, #0x28]
00b7e750	sub w9,w1,#0x2
00b7e754	mov x21,x2
00b7e758	mov w19,w1
00b7e75c	mov x20,x0
00b7e760	add x23,sp,#0x8
00b7e764	cmp w9,#0xe
00b7e768	str x8,[x23]
00b7e76c	b.ls 0x00b7e778
00b7e770	orr w0,wzr,#0xfffffffc
00b7e774	b 0x00b7e8a4
00b7e778	add x0,sp,#0x14
00b7e77c	mov w2,#0x9b4
00b7e780	mov w1,wzr
00b7e784	bl 0x00c301c0
00b7e788	add x0,sp,#0x14
00b7e78c	mov w1,#0x9b3
00b7e790	mov x2,x21
00b7e794	bl 0x00c30c00
00b7e798	cbz x0,0x00b7e7bc
00b7e79c	add x0,sp,#0x14
00b7e7a0	add x21,sp,#0x14
00b7e7a4	bl 0x00c2ff50
00b7e7a8	cbz x0,0x00b7e7c4
00b7e7ac	cmp x0,#0x9b2
00b7e7b0	b.ne 0x00b7e7cc
00b7e7b4	orr w0,wzr,#0xfffffff8
00b7e7b8	b 0x00b7e8a4
00b7e7bc	orr w0,wzr,#0xfffffffe
00b7e7c0	b 0x00b7e8a4
00b7e7c4	add x8,sp,#0x14
00b7e7c8	b 0x00b7e81c
00b7e7cc	sub x9,x0,#0x1
00b7e7d0	add x11,sp,#0x14
00b7e7d4	add x8,x11,x9
00b7e7d8	ldrb w10,[x8]
00b7e7dc	cmp w10,#0xa
00b7e7e0	b.ne 0x00b7e80c
00b7e7e4	add x8,sp,#0x14
00b7e7e8	strb wzr,[x11, x9]
00b7e7ec	cbz x9,0x00b7e81c
00b7e7f0	add x8,x8,x0
00b7e7f4	ldrb w10,[x8, #-0x2]!
00b7e7f8	cmp w10,#0xd
00b7e7fc	b.eq 0x00b7e818
00b7e800	add x8,sp,#0x14
00b7e804	add x8,x8,x9
00b7e808	b 0x00b7e81c
00b7e80c	mov x9,x0
00b7e810	cmp w10,#0xd
00b7e814	b.ne 0x00b7e800
00b7e818	strb wzr,[x8]
00b7e81c	sxtw x9,w19
00b7e820	mov x2,x8
00b7e824	cmp x8,x21
00b7e828	b.ls 0x00b7e898
00b7e82c	ldurb w10,[x2, #-0x1]
00b7e830	sub w8,w10,#0x30
00b7e834	cmp w8,#0x9
00b7e838	sub x8,x2,#0x1
00b7e83c	b.hi 0x00b7e850
00b7e840	sub x10,x10,#0x30
00b7e844	cmp x10,x9
00b7e848	b.cc 0x00b7e820
00b7e84c	b 0x00b7e898
00b7e850	sub w11,w10,#0x41
00b7e854	and w11,w11,#0xff
00b7e858	cmp w11,#0x5
00b7e85c	b.hi 0x00b7e870
00b7e860	sub x10,x10,#0x37
00b7e864	cmp x10,x9
00b7e868	b.cc 0x00b7e820
00b7e86c	b 0x00b7e898
00b7e870	sub w11,w10,#0x61
00b7e874	cmp w11,#0x5
00b7e878	b.hi 0x00b7e88c
00b7e87c	sub x10,x10,#0x57
00b7e880	cmp x10,x9
00b7e884	b.cc 0x00b7e820
00b7e888	b 0x00b7e898
00b7e88c	orr w10,wzr,#0xff
00b7e890	cmp x10,x9
00b7e894	b.cc 0x00b7e820
00b7e898	mov x0,x20
00b7e89c	mov w1,w19
00b7e8a0	bl 0x00c41cc0
00b7e8a4	ldr x8,[x22, #0x28]
00b7e8a8	ldr x9,[x23]
00b7e8ac	cmp x8,x9
00b7e8b0	b.ne 0x00b7e8cc
00b7e8b4	add sp,sp,#0x9d0
00b7e8b8	ldp x29,x30,[sp, #0x30]
00b7e8bc	ldp x20,x19,[sp, #0x20]
00b7e8c0	ldp x22,x21,[sp, #0x10]
00b7e8c4	ldp x28,x23,[sp], #0x40
00b7e8c8	ret
00b7e8cc	bl 0x00c2fec0
