/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61f30..0xc62050 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61f30_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[1728];
    unsigned long long field_6d0;
} st_c61f30_0;


int sub_c61f30(unsigned long long a0, st_c61f30_0 *a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x11
    unsigned long long node;  // x9
    unsigned long v21;  // x10
    unsigned long long iter;  // x9
    char v23;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long idx;  // x19
    unsigned long long v17;  // w0
    unsigned int v18;  // w8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        idx = a0;
        a0 = 0;
        if (a2 >> 7 & 1 && !(*(char *)(idx + 112) & 1) && (!a3 || (a0 = 0, !a4 && (unsigned int)(*(int *)a3) >> 7 & 1)))
        {
            v17 = (unsigned int)sub_95e314(idx, a1, a1->field_8);
            v18 = *(char *)(idx + 112);
            if (v17)
            {
                v19 = a1->field_6d0;
                *(unsigned long long *)(idx + 96) = a5;
                *(unsigned long long *)(idx + 104) = v19;
                *(unsigned long long *)(idx + 64) = a3;
                v18 = (a4 != 0) * 2 | (a5 != 0) * 4 | v18 & 225;
                *(unsigned long long *)(idx + 88) = a4;
                *(char *)(idx + 112) = v18;
                node = idx;
                do
                {
                    v21 = *(char *)(node + 112);
                    if (v21 >> 1 & 1)
                    {
                        *(unsigned long long *)(idx + 72) = node;
                        *(long long *)(idx + 88) = *(long long *)(node + 88);
                        iter = idx;
                        do
                        {
                            if ((char)(*(char *)(iter + 112)) >> 2 & 1)
                            {
                                *(unsigned long long *)(idx + 80) = iter;
                                iter = *(long long *)(iter + 96);
                                goto LABEL_c6202c;
                            }
                        } while ((iter = *(long long *)(iter + 64), iter));
                        *(unsigned long long *)(idx + 80) = 0;
LABEL_c6202c:
                        *(unsigned long long *)(idx + 96) = iter;
                        v23 = (char)v18 | 1;
                        a0 = 1;
                        goto LABEL_c62038;
                    }
                } while ((node == idx || v21 & 1) && (node = *(long long *)(node + 64), node));
            }
            a0 = 0;
            v23 = (char)v18 & 249;
LABEL_c62038:
            *(char *)(idx + 112) = v23;
        }
    }
    return a0;
}
