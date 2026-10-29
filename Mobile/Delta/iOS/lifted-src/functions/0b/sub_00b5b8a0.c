/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b8a0..0xb5ba3c (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b8a0_1 {
    char padding_0[32];
    char field_20;
    char padding_21[31];
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[59];
    struct st_b5b8a0_2 *field_a8;
} st_b5b8a0_1;

typedef struct st_b5b8a0_0 {
    unsigned long long field_0;
} st_b5b8a0_0;

typedef struct st_b5b8a0_2 {
    struct st_b5b8a0_0 *field_0;
} st_b5b8a0_2;


char sub_b5b8a0(st_b5b8a0_1 *a0, char a1, unsigned long a2, char a3, long long n, unsigned long a5, char a6)
{
    st_b5b8a0_1 *ptr;  // x0
    st_b5b8a0_1 *ptr1;  // x1
    long long n1;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&a0->padding_6d[0x33] = 0;
    *(unsigned long long *)&a0->padding_58[8] = 0;
    a0->field_6c = a0->field_6c & 237 | (a6 != 0) * 2;
    if (!sub_a2f9e0())
        return 0;
    if (a3)
    {
        if (a0->field_40 != 1)
        {
            if (16 >= (unsigned long long)n && a0->field_50 == n)
            {
                a0->field_6c = a0->field_6c | 4;
                _memcpy(&a0->field_20, a3, n);
                ptr = a0;
                ptr1 = (st_b5b8a0_1 *)a3;
                n1 = n;
                goto LABEL_b5b96c;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 708, "ossl_cipher_generic_initiv");
                sub_a36abc(57, 109, 0);
                return 0;
            }
        }
    }
    else
    {
        if (a0->field_6c >> 2 & 1 && 2 >= a0->field_40 - 2)
        {
            n1 = a0->field_50;
            ptr = &a0->field_20;
            ptr1 = a0;
LABEL_b5b96c:
            _memcpy(ptr, ptr1, n1);
        }
    }
    if (a1)
    {
        if (!(a0->field_6c >> 5 & 1))
        {
            if (a0->field_48 != a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 216, "cipher_generic_init_internal");
                sub_a36abc(57, 105, 0);
                return 0;
            }
            (*(long long *)a0->field_a8)();
        }
        else
        {
            a0->field_48 = a2;
            (*(long long *)a0->field_a8)();
        }
    }
}
