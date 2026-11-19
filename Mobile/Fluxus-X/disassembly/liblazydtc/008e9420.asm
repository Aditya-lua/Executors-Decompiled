; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::underflow @ 008e9420
008e9420	ldr x8,[x0, #0x58]
008e9424	ldr x9,[x0, #0x30]
008e9428	cmp x8,x9
008e942c	b.cs 0x008e9438
008e9430	mov x8,x9
008e9434	str x9,[x0, #0x58]
008e9438	ldrb w9,[x0, #0x60]
008e943c	tbnz w9,#0x3,0x008e9448
008e9440	mov w0,#0xffffffff
008e9444	ret
008e9448	ldr x9,[x0, #0x20]
008e944c	cmp x9,x8
008e9450	b.cs 0x008e945c
008e9454	mov x9,x8
008e9458	str x8,[x0, #0x20]
008e945c	ldr x8,[x0, #0x18]
008e9460	cmp x8,x9
008e9464	b.cs 0x008e9470
008e9468	ldrb w0,[x8]
008e946c	ret
008e9470	mov w0,#0xffffffff
008e9474	ret
