; RECORD_LAYER_data_present @ 009ca7ec
009ca7ec	ldr w8,[x0, #0xc]
009ca7f0	cmp w8,#0xf1
009ca7f4	b.eq 0x009ca828
009ca7f8	ldr x8,[x0, #0x10]
009ca7fc	cbz x8,0x009ca830
009ca800	mov x9,xzr
009ca804	add x10,x0,#0x688
009ca808	ldr w11,[x10]
009ca80c	cbz w11,0x009ca828
009ca810	add x9,x9,#0x1
009ca814	cmp x9,x8
009ca818	add x10,x10,#0x50
009ca81c	b.cc 0x009ca808
009ca820	mov w0,wzr
009ca824	ret
009ca828	mov w0,#0x1
009ca82c	ret
009ca830	mov w0,wzr
009ca834	ret
