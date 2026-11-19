; bn_mul_fixed_top @ 00a0a6c4
00a0a6c4	sub sp,sp,#0x70
00a0a6c8	stp x28,x27,[sp, #0x10]
00a0a6cc	stp x26,x25,[sp, #0x20]
00a0a6d0	stp x24,x23,[sp, #0x30]
00a0a6d4	stp x22,x21,[sp, #0x40]
00a0a6d8	stp x20,x19,[sp, #0x50]
00a0a6dc	stp x29,x30,[sp, #0x60]
00a0a6e0	ldr w26,[x1, #0x8]
00a0a6e4	mov x20,x0
00a0a6e8	add x29,sp,#0x60
00a0a6ec	cbz w26,0x00a0a76c
00a0a6f0	ldr w24,[x2, #0x8]
00a0a6f4	mov x21,x2
00a0a6f8	cbz w24,0x00a0a76c
00a0a6fc	mov x0,x3
00a0a700	mov x19,x3
00a0a704	mov x22,x1
00a0a708	bl 0x00c38a90
00a0a70c	cmp x20,x22
00a0a710	b.eq 0x00a0a720
00a0a714	cmp x20,x21
00a0a718	mov x23,x20
00a0a71c	b.ne 0x00a0a730
00a0a720	mov x0,x19
00a0a724	bl 0x00c38a40
00a0a728	mov x23,x0
00a0a72c	cbz x0,0x00a0a8d4
00a0a730	cmp w26,#0x8
00a0a734	sub w8,w26,w24
00a0a738	b.ne 0x00a0a77c
00a0a73c	cbnz w8,0x00a0a77c
00a0a740	mov w1,#0x10
00a0a744	mov x0,x23
00a0a748	mov w24,#0x10
00a0a74c	bl 0x00c38e80
00a0a750	cbz x0,0x00a0a8d4
00a0a754	str w24,[x23, #0x8]
00a0a758	ldr x0,[x23]
00a0a75c	ldr x1,[x22]
00a0a760	ldr x2,[x21]
00a0a764	bl 0x00c388f0
00a0a768	b 0x00a0a858
00a0a76c	mov x0,x20
00a0a770	bl 0x00c38e00
00a0a774	mov w20,#0x1
00a0a778	b 0x00a0a8e0
00a0a77c	cmp w26,#0x10
00a0a780	add w25,w24,w26
00a0a784	b.lt 0x00a0a82c
00a0a788	cmp w24,#0x10
00a0a78c	b.lt 0x00a0a82c
00a0a790	add w9,w8,#0x1
00a0a794	cmp w9,#0x2
00a0a798	b.hi 0x00a0a82c
00a0a79c	cmp w8,#0x0
00a0a7a0	csel w8,w26,w24,ge
00a0a7a4	sxtw x0,w8
00a0a7a8	bl 0x00c38d80
00a0a7ac	mov w27,w0
00a0a7b0	mov x0,x19
00a0a7b4	bl 0x00c38a40
00a0a7b8	cbz x0,0x00a0a8d4
00a0a7bc	sub w8,w27,#0x1
00a0a7c0	mov w9,#0x1
00a0a7c4	lsl w27,w9,w8
00a0a7c8	mov x28,x0
00a0a7cc	subs w8,w26,w27
00a0a7d0	str w8,[sp, #0xc]
00a0a7d4	b.gt 0x00a0a888
00a0a7d8	subs w26,w24,w27
00a0a7dc	b.gt 0x00a0a888
00a0a7e0	lsl w24,w27,#0x2
00a0a7e4	mov x0,x28
00a0a7e8	mov w1,w24
00a0a7ec	bl 0x00c38e80
00a0a7f0	cbz x0,0x00a0a8d4
00a0a7f4	mov x0,x23
00a0a7f8	mov w1,w24
00a0a7fc	bl 0x00c38e80
00a0a800	cbz x0,0x00a0a8d4
00a0a804	ldr x0,[x23]
00a0a808	ldr x1,[x22]
00a0a80c	ldr x2,[x21]
00a0a810	ldr x6,[x28]
00a0a814	ldr w4,[sp, #0xc]
00a0a818	mov w3,w27
00a0a81c	mov w5,w26
00a0a820	bl 0x00a09a04
00a0a824	str w25,[x23, #0x8]
00a0a828	b 0x00a0a858
00a0a82c	mov x0,x23
00a0a830	mov w1,w25
00a0a834	bl 0x00c38e80
00a0a838	cbz x0,0x00a0a8d4
00a0a83c	str w25,[x23, #0x8]
00a0a840	ldr x0,[x23]
00a0a844	ldr x1,[x22]
00a0a848	ldr x3,[x21]
00a0a84c	mov w2,w26
00a0a850	mov w4,w24
00a0a854	bl 0x00a09e78
00a0a858	ldr w8,[x22, #0x10]
00a0a85c	ldr w9,[x21, #0x10]
00a0a860	cmp x23,x20
00a0a864	eor w8,w9,w8
00a0a868	str w8,[x23, #0x10]
00a0a86c	b.eq 0x00a0a880
00a0a870	mov x0,x20
00a0a874	mov x1,x23
00a0a878	bl 0x00c36990
00a0a87c	cbz x0,0x00a0a8d4
00a0a880	mov w20,#0x1
00a0a884	b 0x00a0a8d8
00a0a888	lsl w26,w27,#0x3
00a0a88c	mov x0,x28
00a0a890	mov w1,w26
00a0a894	bl 0x00c38e80
00a0a898	cbz x0,0x00a0a8d4
00a0a89c	mov x0,x23
00a0a8a0	mov w1,w26
00a0a8a4	bl 0x00c38e80
00a0a8a8	cbz x0,0x00a0a8d4
00a0a8ac	ldr x0,[x23]
00a0a8b0	ldr x1,[x22]
00a0a8b4	ldr x2,[x21]
00a0a8b8	ldr x6,[x28]
00a0a8bc	ldr w4,[sp, #0xc]
00a0a8c0	sub w5,w24,w27
00a0a8c4	mov w3,w27
00a0a8c8	bl 0x00a09fe0
00a0a8cc	str w25,[x23, #0x8]
00a0a8d0	b 0x00a0a858
00a0a8d4	mov w20,wzr
00a0a8d8	mov x0,x19
00a0a8dc	bl 0x00c38a20
00a0a8e0	mov w0,w20
00a0a8e4	ldp x29,x30,[sp, #0x60]
00a0a8e8	ldp x20,x19,[sp, #0x50]
00a0a8ec	ldp x22,x21,[sp, #0x40]
00a0a8f0	ldp x24,x23,[sp, #0x30]
00a0a8f4	ldp x26,x25,[sp, #0x20]
00a0a8f8	ldp x28,x27,[sp, #0x10]
00a0a8fc	add sp,sp,#0x70
00a0a900	ret
