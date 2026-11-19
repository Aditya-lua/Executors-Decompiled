; LZ4_decompress_safe_usingDict @ 008dc0a0
008dc0a0	cbz w5,0x008dc0bc
008dc0a4	mov w8,w5
008dc0a8	sxtw x5,w8
008dc0ac	add x9,x4,x5
008dc0b0	cmp x9,x1
008dc0b4	b.eq 0x008dc0c0
008dc0b8	b 0x00c30a10
008dc0bc	b 0x00c30320
008dc0c0	mov w9,#0xffff
008dc0c4	cmp w8,w9
008dc0c8	b.lt 0x008dc0d0
008dc0cc	b 0x00c30a00
008dc0d0	mov x4,x5
008dc0d4	b 0x008db0f8
