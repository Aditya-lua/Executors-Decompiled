; FUN_009fa724 @ 009fa724
009fa724	sub sp,sp,#0x70
009fa728	stp x28,x27,[sp, #0x10]
009fa72c	stp x26,x25,[sp, #0x20]
009fa730	stp x24,x23,[sp, #0x30]
009fa734	stp x22,x21,[sp, #0x40]
009fa738	stp x20,x19,[sp, #0x50]
009fa73c	stp x29,x30,[sp, #0x60]
009fa740	add x29,sp,#0x60
009fa744	mov x19,x3
009fa748	mov x20,x2
009fa74c	mov x21,x1
009fa750	mov x22,x0
009fa754	bl 0x00c321b0
009fa758	cbz x0,0x009fa870
009fa75c	ldr x8,[x0]
009fa760	mov x23,x0
009fa764	cbz x8,0x009fa770
009fa768	ldrb w8,[x8]
009fa76c	cbnz w8,0x009fa778
009fa770	ldr w8,[x23, #0x8]
009fa774	cbz w8,0x009fa898
009fa778	mov w24,#0x1
009fa77c	str xzr,[x19]
009fa780	cbz x20,0x009fa874
009fa784	adrp x25,0x2bb000
009fa788	adrp x26,0x2ab000
009fa78c	add x25,x25,#0x9d8
009fa790	add x26,x26,#0x32c
009fa794	ldr w8,[x23, #0xc]
009fa798	cbz w8,0x009fa7f0
009fa79c	ldr x8,[x23]
009fa7a0	cbz x8,0x009fa7d4
009fa7a4	mov x0,x22
009fa7a8	bl 0x00c35620
009fa7ac	ldr x27,[x23]
009fa7b0	mov x28,x0
009fa7b4	mov x0,x27
009fa7b8	bl 0x00c2ff50
009fa7bc	mov x2,x0
009fa7c0	add x3,sp,#0x8
009fa7c4	mov x0,x28
009fa7c8	mov x1,x27
009fa7cc	bl 0x00c38490
009fa7d0	cbz w0,0x009fa870
009fa7d4	mov x0,x22
009fa7d8	bl 0x00c35620
009fa7dc	ldr w2,[x23, #0x8]
009fa7e0	mov x1,x25
009fa7e4	mov x3,x26
009fa7e8	bl 0x00c32250
009fa7ec	str wzr,[x23, #0xc]
009fa7f0	mov x8,xzr
009fa7f4	ldrb w28,[x21, x8]
009fa7f8	cmp w28,#0xa
009fa7fc	b.eq 0x009fa80c
009fa800	add x8,x8,#0x1
009fa804	cmp x8,x20
009fa808	b.cc 0x009fa7f4
009fa80c	cmp w28,#0xa
009fa810	cinc x27,x8,eq
009fa814	cbz x27,0x009fa858
009fa818	mov x0,x22
009fa81c	str xzr,[sp, #0x8]
009fa820	bl 0x00c35620
009fa824	add x3,sp,#0x8
009fa828	mov x1,x21
009fa82c	mov x2,x27
009fa830	bl 0x00c38490
009fa834	cbz w0,0x009fa870
009fa838	ldr x8,[sp, #0x8]
009fa83c	ldr x9,[x19]
009fa840	add x21,x21,x8
009fa844	sub x20,x20,x8
009fa848	add x9,x9,x8
009fa84c	subs x27,x27,x8
009fa850	str x9,[x19]
009fa854	b.ne 0x009fa818
009fa858	cmp w28,#0xa
009fa85c	b.ne 0x009fa864
009fa860	str w24,[x23, #0xc]
009fa864	cbnz x20,0x009fa794
009fa868	mov w24,#0x1
009fa86c	b 0x009fa874
009fa870	mov w24,wzr
009fa874	mov w0,w24
009fa878	ldp x29,x30,[sp, #0x60]
009fa87c	ldp x20,x19,[sp, #0x50]
009fa880	ldp x22,x21,[sp, #0x40]
009fa884	ldp x24,x23,[sp, #0x30]
009fa888	ldp x26,x25,[sp, #0x20]
009fa88c	ldp x28,x27,[sp, #0x10]
009fa890	add sp,sp,#0x70
009fa894	ret
009fa898	cbz x20,0x009fa8b0
009fa89c	add x8,x21,x20
009fa8a0	ldurb w8,[x8, #-0x1]
009fa8a4	cmp w8,#0xa
009fa8a8	cset w8,eq
009fa8ac	str w8,[x23, #0xc]
009fa8b0	mov x0,x22
009fa8b4	bl 0x00c35620
009fa8b8	mov x1,x21
009fa8bc	mov x2,x20
009fa8c0	mov x3,x19
009fa8c4	ldp x29,x30,[sp, #0x60]
009fa8c8	ldp x20,x19,[sp, #0x50]
009fa8cc	ldp x22,x21,[sp, #0x40]
009fa8d0	ldp x24,x23,[sp, #0x30]
009fa8d4	ldp x26,x25,[sp, #0x20]
009fa8d8	ldp x28,x27,[sp, #0x10]
009fa8dc	add sp,sp,#0x70
009fa8e0	b 0x00c38490
