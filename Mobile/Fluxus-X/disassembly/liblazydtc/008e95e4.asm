; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::overflow @ 008e95e4
008e95e4	sub sp,sp,#0x80
008e95e8	stp x28,x27,[sp, #0x20]
008e95ec	stp x26,x25,[sp, #0x30]
008e95f0	stp x24,x23,[sp, #0x40]
008e95f4	stp x22,x21,[sp, #0x50]
008e95f8	stp x20,x19,[sp, #0x60]
008e95fc	stp x29,x30,[sp, #0x70]
008e9600	add x29,sp,#0x70
008e9604	mrs x22,tpidr_el0
008e9608	ldr x8,[x22, #0x28]
008e960c	mov w19,w1
008e9610	mov x20,x0
008e9614	cmn w1,#0x1
008e9618	str x8,[sp, #0x18]
008e961c	b.eq 0x008e9640
008e9620	ldp x25,x8,[x20, #0x30]
008e9624	ldp x23,x24,[x20, #0x10]
008e9628	cmp x25,x8
008e962c	b.eq 0x008e9648
008e9630	mov x27,x20
008e9634	ldr x10,[x27, #0x58]!
008e9638	add x26,x27,#0x8
008e963c	b 0x008e9718
008e9640	mov w0,wzr
008e9644	b 0x008e9790
008e9648	mov x26,x20
008e964c	ldrb w8,[x26, #0x60]!
008e9650	tbnz w8,#0x4,0x008e965c
008e9654	mov w0,#0xffffffff
008e9658	b 0x008e9790
008e965c	mov x27,x20
008e9660	ldr x8,[x27, #0x58]!
008e9664	ldur x28,[x27, #-0x30]
008e9668	sub x21,x27,#0x18
008e966c	str x8,[sp, #0x8]
008e9670	mov x0,x21
008e9674	mov w1,wzr
008e9678	bl 0x00c30150
008e967c	ldrb w8,[x21]
008e9680	tbnz w8,#0x0,0x008e96ac
008e9684	lsr w10,w8,#0x1
008e9688	mov w9,#0x16
008e968c	subs x1,x9,x10
008e9690	b.hi 0x008e96c0
008e9694	tbnz w8,#0x0,0x008e96d0
008e9698	add x8,x21,x9
008e969c	lsl w9,w9,#0x1
008e96a0	strb wzr,[x8, #0x1]
008e96a4	strb w9,[x21]
008e96a8	b 0x008e96dc
008e96ac	ldp x9,x10,[x20, #0x40]
008e96b0	and x9,x9,#-0x2
008e96b4	sub x9,x9,#0x1
008e96b8	subs x1,x9,x10
008e96bc	b.ls 0x008e9694
008e96c0	mov x0,x21
008e96c4	mov w2,wzr
008e96c8	bl 0x00c30250
008e96cc	b 0x008e96dc
008e96d0	ldr x8,[x20, #0x50]
008e96d4	strb wzr,[x8, x9]
008e96d8	str x9,[x20, #0x48]
008e96dc	ldr x9,[sp, #0x8]
008e96e0	ldrb w8,[x21]
008e96e4	sub x10,x25,x28
008e96e8	sub x9,x9,x28
008e96ec	tbnz w8,#0x0,0x008e96fc
008e96f0	add x11,x21,#0x1
008e96f4	lsr w8,w8,#0x1
008e96f8	b 0x008e9700
008e96fc	ldp x8,x11,[x20, #0x48]
008e9700	add x8,x11,x8
008e9704	add x25,x11,x10
008e9708	add x10,x11,x9
008e970c	stp x25,x8,[x20, #0x30]
008e9710	str x11,[x20, #0x28]
008e9714	str x10,[x20, #0x58]
008e9718	add x9,x25,#0x1
008e971c	cmp x9,x10
008e9720	add x10,sp,#0x10
008e9724	str x9,[sp, #0x10]
008e9728	csel x10,x27,x10,cc
008e972c	ldr x10,[x10]
008e9730	str x10,[x27]
008e9734	ldrb w11,[x26]
008e9738	tbz w11,#0x3,0x008e9764
008e973c	mov x12,x20
008e9740	ldrb w13,[x12, #0x40]!
008e9744	sub x11,x24,x23
008e9748	tbnz w13,#0x0,0x008e9754
008e974c	add x12,x12,#0x1
008e9750	b 0x008e9758
008e9754	ldr x12,[x20, #0x50]
008e9758	add x11,x12,x11
008e975c	stp x12,x11,[x20, #0x10]
008e9760	str x10,[x20, #0x20]
008e9764	cmp x25,x8
008e9768	b.eq 0x008e977c
008e976c	str x9,[x20, #0x30]
008e9770	strb w19,[x25]
008e9774	and w0,w19,#0xff
008e9778	b 0x008e9790
008e977c	ldr x8,[x20]
008e9780	and w1,w19,#0xff
008e9784	mov x0,x20
008e9788	ldr x8,[x8, #0x68]
008e978c	blr x8
008e9790	ldr x8,[x22, #0x28]
008e9794	ldr x9,[sp, #0x18]
008e9798	cmp x8,x9
008e979c	b.ne 0x008e97c0
008e97a0	ldp x29,x30,[sp, #0x70]
008e97a4	ldp x20,x19,[sp, #0x60]
008e97a8	ldp x22,x21,[sp, #0x50]
008e97ac	ldp x24,x23,[sp, #0x40]
008e97b0	ldp x26,x25,[sp, #0x30]
008e97b4	ldp x28,x27,[sp, #0x20]
008e97b8	add sp,sp,#0x80
008e97bc	ret
008e97c0	bl 0x00c2fec0
