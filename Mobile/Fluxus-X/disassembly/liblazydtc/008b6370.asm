; FUN_008b6370 @ 008b6370
008b6370	ldr x0,[x0, #0x60]
008b6374	ldrb w8,[x0, #0x1]
008b6378	cmp w8,#0x2
008b637c	b.ne 0x008b6388
008b6380	mov x1,x2
008b6384	b 0x008b61bc
008b6388	ldrb w8,[x1, #0x2]
008b638c	and w8,w8,#0xfffffffb
008b6390	strb w8,[x1, #0x2]
008b6394	ldr x8,[x0, #0x60]
008b6398	str x1,[x0, #0x60]
008b639c	str x8,[x1, #0x18]
008b63a0	ret
