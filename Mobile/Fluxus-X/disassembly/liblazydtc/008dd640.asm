; LZ4_compress_withState @ 008dd640
008dd640	mov w8,#0x7e000000
008dd644	cmp w3,w8
008dd648	b.ls 0x008dd658
008dd64c	mov w4,wzr
008dd650	mov w5,#0x1
008dd654	b 0x00c309d0
008dd658	mov w8,#0x8081
008dd65c	mov w5,#0x1
008dd660	movk w8,#0x8080, LSL #16
008dd664	umull x8,w3,w8
008dd668	lsr x8,x8,#0x27
008dd66c	add w8,w3,w8
008dd670	add w4,w8,#0x10
008dd674	b 0x00c309d0
