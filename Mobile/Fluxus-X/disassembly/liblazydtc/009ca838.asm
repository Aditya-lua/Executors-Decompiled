; RECORD_LAYER_processed_read_pending @ 009ca838
009ca838	ldr x8,[x0, #0x10]
009ca83c	cbz x8,0x009ca868
009ca840	mov x9,xzr
009ca844	add x10,x0,#0x688
009ca848	ldr w11,[x10]
009ca84c	cbz w11,0x009ca870
009ca850	add x9,x9,#0x1
009ca854	cmp x9,x8
009ca858	add x10,x10,#0x50
009ca85c	b.cc 0x009ca848
009ca860	mov w0,wzr
009ca864	ret
009ca868	mov w0,wzr
009ca86c	ret
009ca870	mov w0,#0x1
009ca874	ret
