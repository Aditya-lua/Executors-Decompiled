/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf74ac..0xaf7648 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_af74ac(void* a0)
{
    void* v2;  // x24
    unsigned long v3;  // x20
    unsigned int v4;  // w21
    void* v5;  // x22
    unsigned long long *v6;  // x22
    unsigned long v7;  // x23
    long long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v10;  // x0
    unsigned long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a0[32];
    v3 = (long long)a0[8];
    if ((long long)v2[56])
    {
        v4 = sub_ad69e4((long long)v2[56]);
        v5 = v2;
        v6 = v5 + 72;
        if ((long long)v5[72])
        {
            sub_a6c2e4((long long)v5[72], "crypto/x509/x509_vfy.c", 909);
            *v6 = 0;
        }
        if ((int)v4 >= 1)
        {
            v7 = 0;
            do
            {
                v8 = sub_ad69f8((long long)v2[56], v7);
                if (0 < (int)sub_aefd3c(v3, v8, 0, (int)v2[64], v6))
                    goto LABEL_af7580;
            } while ((v7 = (unsigned int)v7 + 1, v4 != (unsigned int)v7));
        }
        else if (!v4)
        {
            goto LABEL_af7580;
        }
        v9 = (long long)a0[8];
        *(unsigned int *)&a0[172] = 0;
        if (!v9)
            v9 = sub_ad69f8((long long)a0[152], 0);
        *(unsigned long *)&a0[184] = v9;
        *(unsigned int *)&a0[176] = 62;
        (long long)a0[56]();
    }
    else
    {
LABEL_af7580:
        if ((long long)v2[80] && 0 >= (int)sub_af0098(v3))
        {
            v10 = (long long)a0[8];
            *(unsigned int *)&a0[172] = 0;
            if (!v10)
                v10 = sub_ad69f8((long long)a0[152], 0);
            *(unsigned long *)&a0[184] = v10;
            *(unsigned int *)&a0[176] = 63;
            (long long)a0[56]();
        }
        if (!(long long)v2[96])
        {
            return 1;
        }
        else if (0 >= (int)sub_af0140(v3))
        {
            v11 = (long long)a0[8];
            *(unsigned int *)&a0[172] = 0;
            if (!v11)
                v11 = sub_ad69f8((long long)a0[152], 0);
            *(unsigned long *)&a0[184] = v11;
            *(unsigned int *)&a0[176] = 64;
            (long long)a0[56]();
        }
        else
        {
            return 1;
        }
    }
}
