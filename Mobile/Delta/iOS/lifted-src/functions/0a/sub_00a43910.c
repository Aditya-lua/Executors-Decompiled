/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa43910..0xa43ab4 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a43910(long long a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    long long v2;  // x22
    unsigned int v3;  // w0
    unsigned int v4;  // w23
    unsigned long long v5;  // w0
    unsigned long long v6;  // x0
    unsigned int v7;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v3 = sub_a4fbf0(a0);
    if (!a2)
    {
        return 0;
    }
    else if (a3)
    {
        v4 = v3;
        if (sub_a50720(a0))
        {
            if (a3 & 7 && v4 != 4)
                goto LABEL_a4396c;
        }
        else
        {
            if (a3 < 16)
            {
                return 0xffffffff;
            }
            else if (a3 & 7)
            {
                return 0xffffffff;
            }
        }
        if (sub_a4d068(a1, a2, a3))
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aes.c", 3722, "aes_wrap_cipher");
            sub_a36abc(6, 162, 0);
            return 0;
        }
        v5 = (unsigned int)sub_a50720(a0);
        if (a1)
        {
            if (v4 == 4)
            {
                if (v5)
                    v6 = sub_a98330(v2);
                else
                    v6 = sub_a98544(v2);
            }
            else
            {
                if (v5)
                    v6 = sub_a98010(v2);
                else
                    v6 = sub_a98184(v2);
            }
            if (!v6)
                return 0xffffffff;
            return v6 & 0xffffffff;
        }
        else if (v5)
        {
            if (v4 == 4)
                v7 = (unsigned int)a3 + 7 & 0xfffffff8;
            else
                v7 = a3;
            return v7 + 8;
        }
        else
        {
            return (unsigned int)a3 - 8;
        }
    }
    else
    {
LABEL_a4396c:
        return 0xffffffff;
    }
}
