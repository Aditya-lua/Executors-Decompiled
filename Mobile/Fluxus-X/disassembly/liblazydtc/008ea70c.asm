; std::__ndk1::__split_buffer<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>&>::~__split_buffer @ 008ea70c
008ea70c	stp x22,x21,[sp, #-0x30]!
008ea710	stp x20,x19,[sp, #0x10]
008ea714	stp x29,x30,[sp, #0x20]
008ea718	add x29,sp,#0x20
008ea71c	ldp x20,x21,[x0, #0x8]
008ea720	mov x19,x0
008ea724	cmp x21,x20
008ea728	b.ne 0x008ea73c
008ea72c	b 0x008ea7a4
008ea730	ldr x21,[x19, #0x10]
008ea734	cmp x21,x20
008ea738	b.eq 0x008ea7a4
008ea73c	sub x22,x21,#0x78
008ea740	str x22,[x19, #0x10]
008ea744	ldurb w8,[x21, #-0x28]
008ea748	tbnz w8,#0x0,0x008ea768
008ea74c	ldurb w8,[x21, #-0x48]
008ea750	tbnz w8,#0x0,0x008ea778
008ea754	ldurb w8,[x21, #-0x60]
008ea758	tbnz w8,#0x0,0x008ea788
008ea75c	ldrb w8,[x22]
008ea760	tbz w8,#0x0,0x008ea730
008ea764	b 0x008ea798
008ea768	ldur x0,[x21, #-0x18]
008ea76c	bl 0x00c301d0
008ea770	ldurb w8,[x21, #-0x48]
008ea774	tbz w8,#0x0,0x008ea754
008ea778	ldur x0,[x21, #-0x38]
008ea77c	bl 0x00c301d0
008ea780	ldurb w8,[x21, #-0x60]
008ea784	tbz w8,#0x0,0x008ea75c
008ea788	ldur x0,[x21, #-0x50]
008ea78c	bl 0x00c301d0
008ea790	ldrb w8,[x22]
008ea794	tbz w8,#0x0,0x008ea730
008ea798	ldur x0,[x21, #-0x68]
008ea79c	bl 0x00c301d0
008ea7a0	b 0x008ea730
008ea7a4	ldr x0,[x19]
008ea7a8	cbz x0,0x008ea7bc
008ea7ac	ldp x29,x30,[sp, #0x20]
008ea7b0	ldp x20,x19,[sp, #0x10]
008ea7b4	ldp x22,x21,[sp], #0x30
008ea7b8	b 0x00c301d0
008ea7bc	ldp x29,x30,[sp, #0x20]
008ea7c0	ldp x20,x19,[sp, #0x10]
008ea7c4	ldp x22,x21,[sp], #0x30
008ea7c8	ret
