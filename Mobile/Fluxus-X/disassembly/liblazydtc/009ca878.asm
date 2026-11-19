; RECORD_LAYER_write_pending @ 009ca878
009ca878	ldr x8,[x0, #0x18]
009ca87c	cbz x8,0x009ca898
009ca880	orr w9,wzr,#0x30
009ca884	madd x8,x8,x9,x0
009ca888	ldr x8,[x8, #0x40]
009ca88c	cmp x8,#0x0
009ca890	cset w0,ne
009ca894	ret
009ca898	mov w0,wzr
009ca89c	ret
