; mbedtls_ecjpake_read_round_one @ 00ba0704
00ba0704	sub sp,sp,#0x60
00ba0708	stp x26,x25,[sp, #0x10]
00ba070c	stp x24,x23,[sp, #0x20]
00ba0710	stp x22,x21,[sp, #0x30]
00ba0714	stp x20,x19,[sp, #0x40]
00ba0718	stp x29,x30,[sp, #0x50]
00ba071c	add x29,sp,#0x50
00ba0720	mrs x26,tpidr_el0
00ba0724	ldr x8,[x26, #0x28]
00ba0728	mov w9,#0x1
00ba072c	add x19,x0,#0x8
00ba0730	add x20,x0,#0x40
00ba0734	str x8,[sp, #0x8]
00ba0738	ldp w8,w23,[x0, #0xc8]
00ba073c	ldr w24,[x0]
00ba0740	add x21,x1,x2
00ba0744	mov x22,x0
00ba0748	sub w8,w9,w8
00ba074c	adrp x9,0xcab000
00ba0750	add x9,x9,#0x448
00ba0754	ldr x25,[x9, w8, UXTW #0x3]
00ba0758	add x4,x0,#0x130
00ba075c	str x1,[sp]
00ba0760	mov x6,sp
00ba0764	mov w0,w24
00ba0768	mov x1,x19
00ba076c	mov w2,w23
00ba0770	mov x3,x20
00ba0774	mov x5,x25
00ba0778	mov x7,x21
00ba077c	bl 0x00ba0b44
00ba0780	cbnz w0,0x00ba07bc
00ba0784	add x4,x22,#0x160
00ba0788	mov x6,sp
00ba078c	mov w0,w24
00ba0790	mov x1,x19
00ba0794	mov w2,w23
00ba0798	mov x3,x20
00ba079c	mov x5,x25
00ba07a0	mov x7,x21
00ba07a4	bl 0x00ba0b44
00ba07a8	ldr x8,[sp]
00ba07ac	cmp x8,x21
00ba07b0	ccmp w0,#0x0,#0x0,ne
00ba07b4	mov w8,#0xffffb080
00ba07b8	csel w0,w0,w8,ne
00ba07bc	ldr x8,[x26, #0x28]
00ba07c0	ldr x9,[sp, #0x8]
00ba07c4	cmp x8,x9
00ba07c8	b.ne 0x00ba07e8
00ba07cc	ldp x29,x30,[sp, #0x50]
00ba07d0	ldp x20,x19,[sp, #0x40]
00ba07d4	ldp x22,x21,[sp, #0x30]
00ba07d8	ldp x24,x23,[sp, #0x20]
00ba07dc	ldp x26,x25,[sp, #0x10]
00ba07e0	add sp,sp,#0x60
00ba07e4	ret
00ba07e8	bl 0x00c2fec0
