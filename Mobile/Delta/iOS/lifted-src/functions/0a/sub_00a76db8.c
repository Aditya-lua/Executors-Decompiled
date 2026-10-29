/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa76db8..0xa76e48 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a76db8_0 {
    struct st_a76db8_0 *field_0;
    struct st_a76db8_0 *field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
    long long field_28;
} st_a76db8_0;


st_a76db8_0 * sub_a76db8(st_a76db8_0 *ptr, st_a76db8_0 *a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (ptr && a1)
    {
        if ((int)ptr->field_0 == 1)
            sub_a6c4e8(ptr->field_8, ptr->field_10, "crypto/passphrase.c", 21);
        sub_a6c4e8(ptr->field_20, ptr->field_28, "crypto/passphrase.c", 29);
        memset(ptr, 0, 48);
        *(unsigned int *)&ptr->field_0 = 2;
        ptr->field_8 = a1;
        ptr->field_10 = a2;
        return 1;
    }
    sub_c691e4();
    return 0;
}
