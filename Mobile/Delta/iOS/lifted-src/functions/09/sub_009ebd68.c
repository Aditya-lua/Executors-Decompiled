/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ebd68..0x9ebee0 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ebd68(void* a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    char v3;  // x0
    void* v4;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 > (unsigned long long)*(long long *)a0)
    {
        if (a1 > (unsigned long long)(long long)a0[16])
        {
            if (a1 >= 0x5ffffffd)
            {
                sub_a368c8();
                sub_a369bc("crypto/buffer/buffer.c", 88, "BUF_MEM_grow");
                sub_a36abc(7, 0x80106, 0);
                return 0;
            }
            v2 = (((unsigned int)a1 + 3) * 2863311531 >> 32) * 2 & 0xfffffffc;
            if (!((char)a0[24] & 1))
            {
                v3 = sub_a6c1b4((long long)a0[8], v2, "crypto/buffer/buffer.c", 95);
LABEL_9ebe58:
                if (!v3)
                    return 0;
            }
            else
            {
                v4 = a0;
                v3 = sub_a6c610(v2, "crypto/buffer/buffer.c", 60);
                a0 = v4;
                if (!(long long)v4[8] || !v3)
                    goto LABEL_9ebe58;
                _memcpy();
                sub_a6d4c0((long long)v4[8], *(long long *)a0, "crypto/buffer/buffer.c", 64);
                a0 = v4;
            }
            *(unsigned long long *)&a0[8] = v3;
            *(unsigned long long *)&a0[16] = v2;
            _bzero(v3 + *(long long *)a0, a1 - *(long long *)a0);
            *(unsigned long long *)a0 = a1;
            return a1;
        }
        else
        {
            if ((long long)a0[8])
                _bzero((long long)a0[8] + *(long long *)a0);
        }
    }
    *(unsigned long long *)a0 = a1;
    return a1;
}
