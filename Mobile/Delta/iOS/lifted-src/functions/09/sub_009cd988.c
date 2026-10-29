/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cd988..0x9cdc2c (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cd988_0 {
    char padding_0[24];
    struct st_9cd988_1 *field_18;
} st_9cd988_0;

typedef struct st_9cd988_2 {
    char field_0;
    char padding_1[31];
    struct st_9cd988_0 *field_20;
} st_9cd988_2;

typedef struct st_9cd988_1 {
    unsigned long long field_0;
} st_9cd988_1;


unsigned long long sub_9cd988(unsigned long long a0, st_9cd988_2 *a1, unsigned long long a2)
{
    st_9cd988_0 *v2;  // x9
    unsigned long long v3;  // w8
    unsigned long long v12;  // x25
    long long v13;  // x21
    unsigned long long *v4;  // x23
    unsigned long long v5;  // x0
    unsigned long long v6;  // x8
    long long v7;  // x21
    unsigned long long v8;  // x0
    long long v9;  // x2
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a1->field_20;
    v3 = a1->field_0;
    if (v3 && !*(long long *)a0)
        return a0;
    if (v2 && (v4 = v2->field_18, v4))
    {
        if (3 < v3)
            goto LABEL_9cda90;
LABEL_9cd9d4:
        if (!v3)
            goto LABEL_9cdadc;
        if (v3 == 1)
            goto LABEL_9cdaa8;
        if (v3 != 2)
        {
            return a0;
        }
        else if (v4)
        {
            v4();
        }
        else
        {
            v5 = sub_9cf274(a0, a1);
            if (!(v5 >> 31 & 1))
            {
                v6 = v5 & 0xffffffff;
                if (*(long long *)&a1->padding_1[23] > (long long)v6)
                {
                    v7 = *(long long *)&a1->padding_1[15] + (unsigned int)v6 * 40;
                    v5 = sub_9cdc34(sub_9cf574(a0, v7), v7);
                }
            }
            if (a2)
                return v5;
            v8 = *(long long *)a0;
            v9 = 75;
        }
    }
    else
    {
        v4 = 0;
        if (v3 <= 3)
            goto LABEL_9cd9d4;
LABEL_9cda90:
        if (v3 != 4)
        {
            if (v3 != 5 && v3 != 6)
                return a0;
        }
        else
        {
            if (!v2)
            {
                return a0;
            }
            else if (*(long long *)&v2->padding_0[16])
            {
                goto *((void *)(*(long long *)&v2->padding_0[16]));
            }
            else
            {
                return a0;
            }
        }
LABEL_9cdaa8:
        v10 = sub_9cf298(a0, 0xffffffff, a1);
        if ((unsigned int)v10)
        {
            if (!a2)
            {
                *(unsigned long long *)a0 = 0;
                return v10;
            }
            sub_a69928("assertion failed: embed == 0", "crypto/asn1/tasn_fre.c", 90);
LABEL_9cdadc:
            if (*(long long *)&a1->padding_1[15])
                return sub_9cdc34();
        }
        else if (v4)
        {
            v4();
        }
        else
        {
            v11 = sub_9cf3c8(a0, a1);
            if (*(long long *)&a1->padding_1[23] >= 1)
            {
                v12 = 0;
                v13 = *(long long *)&a1->padding_1[15] + 40 * *(long long *)&a1->padding_1[23] - 40;
                do
                {
                    v11 = sub_9cf584(*(long long *)a0, v13, 0);
                    if (v11)
                        v11 = sub_9cdc34(sub_9cf574(a0, v11), v11);
                } while ((v12 += 1, v13 -= 40, *(long long *)&a1->padding_1[23] > (long long)v12));
            }
            if (a2)
                return v11;
            v8 = *(long long *)a0;
            v9 = 0x77;
        }
    }
    v10 = sub_a6c2e4(v8, "crypto/asn1/tasn_fre.c", v9);
    *(unsigned long long *)a0 = 0;
    return v10;
}
