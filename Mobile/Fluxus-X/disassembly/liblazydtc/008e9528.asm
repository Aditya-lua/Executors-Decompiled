; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::xsputn @ 008e9528
008e9528	str x23,[sp, #-0x40]!
008e952c	stp x22,x21,[sp, #0x10]
008e9530	stp x20,x19,[sp, #0x20]
008e9534	stp x29,x30,[sp, #0x30]
008e9538	add x29,sp,#0x30
008e953c	mov x19,x2
008e9540	mov x20,x1
008e9544	cmp x2,#0x1
008e9548	mov x22,x0
008e954c	mov x21,xzr
008e9550	b.lt 0x008e95cc
008e9554	ldp x0,x8,[x22, #0x30]
008e9558	cmp x0,x8
008e955c	b.cs 0x008e95a0
008e9560	sub x8,x8,x0
008e9564	sub x9,x19,x21
008e9568	cmp x9,x8
008e956c	csel x23,x9,x8,lt
008e9570	cbz x23,0x008e9584
008e9574	mov x1,x20
008e9578	mov x2,x23
008e957c	bl 0x00c2ffd0
008e9580	ldr x0,[x22, #0x30]
008e9584	add x8,x0,x23
008e9588	add x20,x20,x23
008e958c	add x21,x23,x21
008e9590	str x8,[x22, #0x30]
008e9594	cmp x21,x19
008e9598	b.lt 0x008e9554
008e959c	b 0x008e95cc
008e95a0	ldr x8,[x22]
008e95a4	ldrb w1,[x20]
008e95a8	mov x0,x22
008e95ac	ldr x8,[x8, #0x68]
008e95b0	blr x8
008e95b4	cmn w0,#0x1
008e95b8	b.eq 0x008e95cc
008e95bc	add x20,x20,#0x1
008e95c0	add x21,x21,#0x1
008e95c4	cmp x21,x19
008e95c8	b.lt 0x008e9554
008e95cc	mov x0,x21
008e95d0	ldp x29,x30,[sp, #0x30]
008e95d4	ldp x20,x19,[sp, #0x20]
008e95d8	ldp x22,x21,[sp, #0x10]
008e95dc	ldr x23,[sp], #0x40
008e95e0	ret
