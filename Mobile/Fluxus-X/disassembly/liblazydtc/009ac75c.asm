; ssl_cert_select_current @ 009ac75c
009ac75c	sub sp,sp,#0x70
009ac760	stp x28,x27,[sp, #0x10]
009ac764	stp x26,x25,[sp, #0x20]
009ac768	stp x24,x23,[sp, #0x30]
009ac76c	stp x22,x21,[sp, #0x40]
009ac770	stp x20,x19,[sp, #0x50]
009ac774	stp x29,x30,[sp, #0x60]
009ac778	add x29,sp,#0x60
009ac77c	cbz x1,0x009ac940
009ac780	mov x25,x0
009ac784	mov x19,x0
009ac788	ldr x0,[x25, #0x20]!
009ac78c	mov x20,x1
009ac790	cmp x0,x1
009ac794	b.eq 0x009ac948
009ac798	mov x21,x19
009ac79c	ldr x8,[x21, #0x48]!
009ac7a0	cmp x8,x20
009ac7a4	b.eq 0x009ac954
009ac7a8	mov x28,x19
009ac7ac	ldr x8,[x28, #0x70]!
009ac7b0	cmp x8,x20
009ac7b4	b.eq 0x009ac964
009ac7b8	mov x27,x19
009ac7bc	ldr x8,[x27, #0x98]!
009ac7c0	cmp x8,x20
009ac7c4	b.eq 0x009ac974
009ac7c8	mov x26,x19
009ac7cc	ldr x8,[x26, #0xc0]!
009ac7d0	cmp x8,x20
009ac7d4	b.eq 0x009ac984
009ac7d8	mov x24,x19
009ac7dc	ldr x8,[x24, #0xe8]!
009ac7e0	cmp x8,x20
009ac7e4	b.eq 0x009ac994
009ac7e8	ldr x8,[x19, #0x110]
009ac7ec	add x23,x19,#0x110
009ac7f0	cmp x8,x20
009ac7f4	b.eq 0x009ac9a4
009ac7f8	ldr x8,[x19, #0x138]
009ac7fc	add x22,x19,#0x138
009ac800	cmp x8,x20
009ac804	b.eq 0x009ac9b4
009ac808	ldr x8,[x19, #0x160]
009ac80c	add x9,x19,#0x160
009ac810	cmp x8,x20
009ac814	b.eq 0x009ac9c4
009ac818	ldr x8,[x19, #0x28]
009ac81c	str x9,[sp, #0x8]
009ac820	cbz x8,0x009ac834
009ac824	cbz x0,0x009ac834
009ac828	mov x1,x20
009ac82c	bl 0x00c35080
009ac830	cbz w0,0x009ac9d0
009ac834	ldr x8,[x19, #0x50]
009ac838	cbz x8,0x009ac854
009ac83c	ldr x0,[x21]
009ac840	cbz x0,0x009ac854
009ac844	mov x1,x20
009ac848	bl 0x00c35080
009ac84c	mov x25,x21
009ac850	cbz w0,0x009ac9d0
009ac854	ldr x8,[x19, #0x78]
009ac858	cbz x8,0x009ac874
009ac85c	ldr x0,[x28]
009ac860	cbz x0,0x009ac874
009ac864	mov x1,x20
009ac868	bl 0x00c35080
009ac86c	mov x25,x28
009ac870	cbz w0,0x009ac9d0
009ac874	ldr x8,[x19, #0xa0]
009ac878	cbz x8,0x009ac894
009ac87c	ldr x0,[x27]
009ac880	cbz x0,0x009ac894
009ac884	mov x1,x20
009ac888	bl 0x00c35080
009ac88c	mov x25,x27
009ac890	cbz w0,0x009ac9d0
009ac894	ldr x8,[x19, #0xc8]
009ac898	cbz x8,0x009ac8b4
009ac89c	ldr x0,[x26]
009ac8a0	cbz x0,0x009ac8b4
009ac8a4	mov x1,x20
009ac8a8	bl 0x00c35080
009ac8ac	mov x25,x26
009ac8b0	cbz w0,0x009ac9d0
009ac8b4	ldr x8,[x19, #0xf0]
009ac8b8	cbz x8,0x009ac8d4
009ac8bc	ldr x0,[x24]
009ac8c0	cbz x0,0x009ac8d4
009ac8c4	mov x1,x20
009ac8c8	bl 0x00c35080
009ac8cc	mov x25,x24
009ac8d0	cbz w0,0x009ac9d0
009ac8d4	ldr x8,[x19, #0x118]
009ac8d8	cbz x8,0x009ac8f4
009ac8dc	ldr x0,[x23]
009ac8e0	cbz x0,0x009ac8f4
009ac8e4	mov x1,x20
009ac8e8	bl 0x00c35080
009ac8ec	mov x25,x23
009ac8f0	cbz w0,0x009ac9d0
009ac8f4	ldr x8,[x19, #0x140]
009ac8f8	cbz x8,0x009ac914
009ac8fc	ldr x0,[x22]
009ac900	cbz x0,0x009ac914
009ac904	mov x1,x20
009ac908	bl 0x00c35080
009ac90c	mov x25,x22
009ac910	cbz w0,0x009ac9d0
009ac914	ldr x8,[x19, #0x168]
009ac918	cbz x8,0x009ac940
009ac91c	ldr x25,[sp, #0x8]
009ac920	ldr x0,[x25]
009ac924	cbz x0,0x009ac9d8
009ac928	mov x1,x20
009ac92c	bl 0x00c35080
009ac930	mov w8,w0
009ac934	mov w0,wzr
009ac938	cbnz w8,0x009ac9d8
009ac93c	b 0x009ac9d0
009ac940	mov w0,wzr
009ac944	b 0x009ac9d8
009ac948	ldr x8,[x19, #0x28]
009ac94c	cbnz x8,0x009ac9d0
009ac950	b 0x009ac798
009ac954	ldr x8,[x19, #0x50]
009ac958	cbz x8,0x009ac7a8
009ac95c	mov x25,x21
009ac960	b 0x009ac9d0
009ac964	ldr x8,[x19, #0x78]
009ac968	cbz x8,0x009ac7b8
009ac96c	mov x25,x28
009ac970	b 0x009ac9d0
009ac974	ldr x8,[x19, #0xa0]
009ac978	cbz x8,0x009ac7c8
009ac97c	mov x25,x27
009ac980	b 0x009ac9d0
009ac984	ldr x8,[x19, #0xc8]
009ac988	cbz x8,0x009ac7d8
009ac98c	mov x25,x26
009ac990	b 0x009ac9d0
009ac994	ldr x8,[x19, #0xf0]
009ac998	cbz x8,0x009ac7e8
009ac99c	mov x25,x24
009ac9a0	b 0x009ac9d0
009ac9a4	ldr x8,[x19, #0x118]
009ac9a8	cbz x8,0x009ac7f8
009ac9ac	mov x25,x23
009ac9b0	b 0x009ac9d0
009ac9b4	ldr x8,[x19, #0x140]
009ac9b8	cbz x8,0x009ac808
009ac9bc	mov x25,x22
009ac9c0	b 0x009ac9d0
009ac9c4	ldr x8,[x19, #0x168]
009ac9c8	cbz x8,0x009ac818
009ac9cc	mov x25,x9
009ac9d0	mov w0,#0x1
009ac9d4	str x25,[x19]
009ac9d8	ldp x29,x30,[sp, #0x60]
009ac9dc	ldp x20,x19,[sp, #0x50]
009ac9e0	ldp x22,x21,[sp, #0x40]
009ac9e4	ldp x24,x23,[sp, #0x30]
009ac9e8	ldp x26,x25,[sp, #0x20]
009ac9ec	ldp x28,x27,[sp, #0x10]
009ac9f0	add sp,sp,#0x70
009ac9f4	ret
